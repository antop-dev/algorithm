package com.leetcode

// https://github.com/antop-dev/algorithm/issues/273
class P763 {
    fun partitionLabels(s: String): List<Int> {
        val last = IntArray(26)
        for (i in s.indices) last[s[i] - 'a'] = i

        val answer = mutableListOf<Int>()
        var j = 0
        var anchor = 0
        for (i in s.indices) {
            j = maxOf(j, last[s[i] - 'a'])
            if (i == j) {
                answer += i - anchor + 1
                anchor = i + 1
            }
        }

        return answer
    }
}
