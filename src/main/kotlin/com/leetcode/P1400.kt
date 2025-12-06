package com.leetcode

// https://github.com/antop-dev/algorithm/issues/703
class P1400 {
    fun canConstruct(s: String, k: Int): Boolean {
        // Hint 1
        if (s.length < k) {
            return false
        }
        // 짝수 문자열들의 갯수
        val odd = s.groupingBy { it }.eachCount().filter { it.value % 2 == 1 }.size
        // Hint 2 + 3
        return odd <= k
    }
}