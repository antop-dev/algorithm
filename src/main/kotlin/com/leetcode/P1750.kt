package com.leetcode

// https://github.com/antop-dev/algorithm/issues/376
class P1750 {
    fun minimumLength(s: String): Int {
        var i = 0
        var k = s.lastIndex
        while (i <= k) {
            // 한글자만 남았을 경우
            if (i == k) return 1
            // 양 끝의 문자가 다를 경우
            if (s[i] != s[k]) return k - i + 1
            // 동일한 문자 넘기기
            val v = s[i]
            while (v == s[i] && i < k) i++
            while (v == s[k] && k >= i) k--
        }
        return 0
    }
}
