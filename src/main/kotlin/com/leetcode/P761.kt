package com.leetcode

// https://github.com/antop-dev/algorithm/issues/785
class P761 {
    fun makeLargestSpecial(s: String): String {
        val pieces = mutableListOf<String>()
        var prefixSum = 0
        var anchor = 0
        for (i in s.indices) {
            prefixSum += if (s[i] == '1') +1 else -1
            if (prefixSum == 0) {
                pieces += s.substring(anchor + 1, i)
                anchor = i + 1
            }
        }
        // "1" + R(내부값) + "0"
        return pieces.map { "1" + makeLargestSpecial(it) + "0" }
            .sortedDescending() // 사전순 내림차순 정렬
            .joinToString("") // 합침
    }
}
