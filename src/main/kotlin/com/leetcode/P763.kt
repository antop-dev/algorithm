package com.leetcode

// https://github.com/antop-dev/algorithm/issues/273
class P763 {
    fun partitionLabels(s: String): List<Int> {
        val last = IntArray(26)
        for (i in s.indices) last[s[i] - 'a'] = i

        val answer = mutableListOf<Int>()
        var max = 0
        var anchor = 0
        for (i in s.indices) {
            max = maxOf(max, last[s[i] - 'a'])
            if (i == max) {
                answer += i - anchor + 1
                anchor = i + 1
            }
        }

        return answer
    }
}
