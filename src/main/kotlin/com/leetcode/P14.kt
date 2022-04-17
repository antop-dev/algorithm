package com.leetcode

// https://github.com/antop-dev/algorithm/issues/37
class P14 {
    fun longestCommonPrefix(strings: Array<String>): String {
        // 가장 짧은 문자열 길이 구하기
        var min = Int.MAX_VALUE
        for (s in strings) {
            if (s.length < min) {
                min = s.length
            }
        }
        // 글자 비교
        val sb = StringBuffer()
        loop@ for (i in 0 until min) {
            val c = strings[0][i]
            for (s in strings) {
                if (c != s[i]) break@loop
            }
            sb.append(c)
        }

        return sb.toString()
    }
}
