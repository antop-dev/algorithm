package com.leetcode

// https://leetcode.com/problems/find-common-characters/
class P1002 {
    fun commonChars(A: Array<String>): List<String> {
        if (A.size == 1) return listOf(A[0])
        val hash = hashMapOf<Int, Int>()
        val answer = mutableListOf<String>()
        for (i in A[0].indices) {
            for (j in 1 until A.size) {
                val indexOf = A[j].indexOf(A[0][i])
                if (indexOf != -1) {
                    hash[j] = indexOf
                }
            }

            if (hash.size == A.size - 1) {
                answer += "${A[0][i]}"
                for (l in 1 until A.size) {
                    A[l] = A[l].removeRange(hash[l]!!, hash[l]!! + 1)
                }
            }
            hash.clear()
        }
        return answer
    }
}
