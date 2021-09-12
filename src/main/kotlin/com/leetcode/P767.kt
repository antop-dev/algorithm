package com.leetcode

// https://github.com/antop-dev/algorithm/issues/329
class P767 {
    fun reorganizeString(s: String): String {
        val map = mutableMapOf<Char, Int>()
        for (c in s) map[c] = map[c]?.run { this + 1 } ?: 1

        val list = map.entries.sortedByDescending { it.value }
        val a = CharArray(s.length)

        var i = 0
        for (e in list) {
            repeat(e.value) {
                a[i] = e.key
                i += 2
                if (i >= s.length) i = 1
            }
        }

        for (i in 1 until a.size) {
            if (a[i - 1] == a[i]) return ""
        }

        return a.joinToString("")
    }
}
