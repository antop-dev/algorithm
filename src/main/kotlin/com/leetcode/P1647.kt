package com.leetcode

// https://github.com/antop-dev/algorithm/issues/792
class P1647 {
    fun minDeletions(s: String): Int {
        // 문자당 빈도수
        val count = IntArray(26)
        for (ch in s) {
            count[ch - 'a']++
        }
        // freq[빈도수] = 빈도수의 개수
        val freq = IntArray(100_001)
        for (c in count) {
            freq[c]++
        }
        // 빈도수가 겹치는 문자들을 하나만 남기고 하나씩 빼면서 계산해 나간다.
        var ans = 0
        for (i in freq.lastIndex downTo 1) {
            if (freq[i] > 1) {
                ans += freq[i] - 1
                freq[i - 1] += freq[i] - 1
            }
        }
        return ans
    }
}
