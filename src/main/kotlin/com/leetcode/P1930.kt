package com.leetcode

// https://github.com/antop-dev/algorithm/issues/679
class P1930 {
    fun countPalindromicSubsequence(s: String): Int {
        // 알파벳('a' = 0 index)의 시작과 끝 인덱스를 기록
        val alphabet = Array(26) { intArrayOf(s.length, -1) }
        for (i in s.indices) {
            val ch = s[i]
            val k = ch - 'a'
            if (i < alphabet[k][0]) {
                alphabet[k][0] = i
            }
            if (i > alphabet[k][1]) {
                alphabet[k][1] = i
            }
        }

        var ans = 0
        for (i in alphabet.indices){
            val (left, right) = alphabet[i]
            if (left < right) { // 첫번째 문자와 세번째 문자 사이에 문자들이 있다면
                ans += count(s, left, right)
            }
        }
        return ans
    }

    /**
     * [left]와 [right] 사이에 중복되지 않는 문자의 수를 센다
     */
    private fun count(s: String, left: Int, right: Int): Int {
        var count = 0
        val used = BooleanArray(26)
        for (k in left + 1 until right) {
            val mid = s[k] - 'a'
            if (!used[mid]) {
                count++
                used[mid] = true
            }
        }
        return count
    }
}