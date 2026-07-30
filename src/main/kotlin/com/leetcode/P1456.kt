package com.leetcode

// https://github.com/antop-dev/algorithm/issues/771
class P1456 {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var i = 0
        var j = 0
        var count = 0
        var ans = 0
        while (j < s.length) {
            if (s[j] in vowels) {
                count++
            }
            j++
            ans = maxOf(ans, count)
            if (ans == k) { // 최대치라면 뒤에 탐색할 필요 없음
                return k
            }
            // 슬라이딩 윈도우 유지
            if (j - i + 1 > k) {
                if (s[i] in vowels) {
                    count--
                }
                i++
            }
        }
        return ans
    }
}
