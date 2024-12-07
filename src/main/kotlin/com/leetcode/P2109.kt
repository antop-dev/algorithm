package com.leetcode

// https://github.com/antop-dev/algorithm/issues/606
class P2109 {
    fun addSpaces(s: String, spaces: IntArray): String {
        return buildString {
            var k = 0
            s.forEachIndexed { i, ch ->
                if (k < spaces.size && i == spaces[k]) {
                    append(' ')
                    k++
                }
                append(ch)
            }
        }
    }
}
