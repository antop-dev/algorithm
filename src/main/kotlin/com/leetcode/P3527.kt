package com.leetcode

// https://github.com/antop-dev/algorithm/issues/741
class P3527 {
    fun mostCommonResponse(responses: Array<Array<String>>): String {
        // 문자열 카운팅
        val hash = mutableMapOf<String, Int>()
        var mostCommonString = ""
        var mostCommonCount = 0

        for (response in responses) {
            // 중복 제거
            val set = response.toSet()
            // 카운팅 갱신 후 비교
            for (s in set) {
                hash[s] = (hash[s] ?: 0) + 1
                val count = hash[s] ?: 0
                if (count < mostCommonCount) {
                    continue
                }
                if (count > mostCommonCount || s < mostCommonString) {
                    mostCommonString = s
                    mostCommonCount = count
                }
            }
        }
        return mostCommonString
    }
}
