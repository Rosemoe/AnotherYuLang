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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class YulangModule {

    private final Map<String, Map<Integer, YulangCallable>> functionMap;
    private final ReadWriteLock lock;
    private final String name;

    public YulangModule(String name) {
        this.name = Objects.requireNonNull(name);
        lock = new ReentrantReadWriteLock();
        functionMap = new HashMap<>(16);
    }

    public String getName() {
        return name;
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
            return callableMap != null ? callableMap.get(argumentCount) : null;
        } finally {
            lock.readLock().unlock();
        }
    }

}
