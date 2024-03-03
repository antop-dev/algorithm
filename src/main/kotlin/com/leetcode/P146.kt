package com.leetcode

// https://github.com/antop-dev/algorithm/issues/381
class P146(private val capacity: Int) {
    val map = LinkedHashMap<Int, Int>(capacity + 1, 1F, true)

    fun get(key: Int): Int {
        return map[key] ?: -1
    }

    fun put(key: Int, value: Int) {
        map[key] = value
        if (map.size > capacity) {
            map -= map.keys.first()
        }
    }
}
