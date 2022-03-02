package com.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

// https://github.com/antop-dev/algorithm/issues/381
public class P146 {
    private final Map<Integer, Integer> map;
    private final int capacity;

    public P146(int capacity) {
        this.map = new LinkedHashMap<>(capacity, 1f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > capacity) {
            int first = map.keySet().iterator().next();
            map.remove(first);
        }
    }

}
