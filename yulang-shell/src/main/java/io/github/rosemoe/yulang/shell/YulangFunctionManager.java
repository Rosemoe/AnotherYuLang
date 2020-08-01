/*
 *    Copyright 2020 Rosemoe
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.rosemoe.yulang.shell;

import io.github.rosemoe.yulang.shell.functions.S;
import io.github.rosemoe.yulang.shell.functions.Ss;
import io.github.rosemoe.yulang.shell.functions.Syso;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class YulangFunctionManager {

    private final Map<String, Map<Integer, YulangCallable>> functionMap;
    private final Map<String, YulangModule> moduleMap;
    private final ReadWriteLock lock;

    public YulangFunctionManager() {
        lock = new ReentrantReadWriteLock();
        functionMap = new HashMap<>(512);
        moduleMap = new ConcurrentHashMap<>(32);
        registerSystemFunctions();
    }

    public void registerSystemFunctions() {
        registerFunction("syso", Syso.INSTANCE);
        registerFunction("s", S.INSTANCE);
        registerFunction("ss", Ss.INSTANCE);
    }

    public void registerFunction(String name, YulangCallable function) {
        Objects.requireNonNull(name);
        lock.writeLock().lock();
        try {
            int scriptArgumentCount = function.getArgumentCount();
            Map<Integer, YulangCallable> callableMap = functionMap.get(name);
            if (callableMap == null) {
                callableMap = new TreeMap<>();
                functionMap.put(name, callableMap);
            }
            callableMap.put(scriptArgumentCount, function);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void unregisterFunction(String name, YulangCallable function) {
        Objects.requireNonNull(name);
        lock.writeLock().lock();
        try {
            int scriptArgumentCount = function.getArgumentCount();
            Map<Integer, YulangCallable> callableMap = functionMap.get(name);
            if (callableMap != null) {
                callableMap.remove(scriptArgumentCount);
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    public YulangCallable resolve(String name, int argumentCount) {
        lock.readLock().lock();
        try {
            Map<Integer, YulangCallable> callableMap = functionMap.get(name);
            YulangCallable callable = null;
            if (callableMap != null) {
                callable = callableMap.get(argumentCount);
                if (callable == null) {
                    callable = callableMap.get(-1);
                }
            }
            return callable;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void registerModule(YulangModule module) {
        moduleMap.put(module.getName(), module);
    }

    public YulangModule resolveModule(String name) {
        return moduleMap.get(name);
    }

    public void unregisterModule(String moduleName) {
        moduleMap.remove(moduleName);
    }

    public boolean unregisterModule(YulangModule module) {
        return moduleMap.remove(module.getName(), module);
    }

}
