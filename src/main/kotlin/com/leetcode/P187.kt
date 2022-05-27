package com.leetcode

// https://leetcode.com/problems/repeated-dna-sequences/
class P187 {
    fun findRepeatedDnaSequences(s: String): List<String> {
        val answer = mutableSetOf<String>()
        if (s.length <= 10) return listOf()
        // 해시값들이 들어갈 Set
        val seen = mutableSetOf<Int>()
        // 처음 10자리를 해싱한다.
        var hash = 0
        for (i in 0 until 10) {
            hash = hash.shl(2) + int(s[i])
        }
        // 처음 만들어진 해시를 저장
        seen += hash
        // 나머지 해시값 비교
        for (i in 10 until s.length) {
            // 해시값을 조정한다.
            hash = hash.and(1.shl(18) - 1)
            hash = hash.shl(2) + int(s[i])
            // Set에 add() 했을 때 false면 이미 값이 있다는 것이다.
            if (!seen.add(hash)) {
                answer.add(s.substring(i - 9, i + 1))
            }
        }
        return answer.toList()
    }

    private fun int(ch: Char): Int {
        return when (ch) {
            'A' -> 0
            'C' -> 1
            'G' -> 2
            'T' -> 3
            else -> 0
        }
    }
}
