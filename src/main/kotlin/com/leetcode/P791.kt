package com.leetcode

// https://github.com/antop-dev/algorithm/issues/534
class P791 {

    fun customSortString(order: String, s: String): String {
        // s 문자열의 문자의 개수
        val counter = IntArray(26)
        for (ch in s) counter[ch - 'a']++

        return buildString {
            for (ch in order) { // 정렬에 있는 문자
                val i = ch - 'a'
                val count = counter[i]
                if (count > 0) {
                    repeat(count) { append(ch) }
                    counter[i] = 0
                }
            }
            for (i in counter.indices) { // 정렬에 없는 문자
                val count = counter[i]
                if (count > 0) {
                    repeat(count) { append('a' + i) }
                }
            }
        }
    }

}
