package com.leetcode

// https://github.com/antop-dev/algorithm/issues/329
class P767 {
    fun reorganizeString(s: String): String {
        val map = mutableMapOf<Char, Int>()
        for (c in s) map[c] = map[c]?.run { this + 1 } ?: 1

        val entries = map.entries.sortedByDescending { it.value }
        val arr = CharArray(s.length)

        var i = 0
        for (e in entries) {
            repeat(e.value) {
                arr[i] = e.key
                if (i > 0 && arr[i - 1] == arr[i]) return ""
                if (i < arr.lastIndex && arr[i] == arr[i + 1]) return ""
                i += 2
                if (i >= s.length) i = 1
            }
        }

        return arr.joinToString("")
    }
}
