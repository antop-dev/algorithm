package com.leetcode

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
class P14 {
    fun longestCommonPrefix(strings: Array<String>): String {
        // 문자열들 중 ""이 포함되어 있으면 무조건 ""
        if (strings.filter { it.isEmpty() }.any()) {
            return "";
        }

        // 가장 긴 시작 문자열
        var longestPrefix = ""
        // 가장 긴 길이
        var maxLen = 0
        for (string in strings) {
            var len = 0

            check@ for (i in string.indices) {
                for (word in strings) {
                    if (word.length < string.length || word[i] != string[i]) {
                        break@check
                    }
                }
                len++
            }

            if (len > maxLen) {
                longestPrefix = string.substring(0, len)
                maxLen = len
            }
        }
        return longestPrefix
    }
}