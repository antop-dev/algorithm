package com.leetcode

// https://github.com/antop-dev/algorithm/issues/490
class P438 {

    fun findAnagrams(s: String, p: String): List<Int> {
        val counter = IntArray(26)
        for (ch in p) {
            counter[ch - 'a']++
        }

        val answer = mutableListOf<Int>()
        val len = p.length
        var left = 0
        var right = 0

        while (right < s.length) {
            counter[s[right] - 'a']--
            if (right - left + 1 > len) {
                counter[s[left] - 'a']++
                left++
            }
            if (right - left + 1 == len && counter.all { it == 0 }) { // 아나그램 체크
                answer += left
            }

            right++
        }

        return answer
    }

}
