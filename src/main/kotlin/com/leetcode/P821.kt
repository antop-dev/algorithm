package com.leetcode

// https://leetcode.com/problems/shortest-distance-to-a-character/
class P821 {
    fun shortestToChar(S: String, C: Char): IntArray {
        val arr = IntArray(S.length) { S.length }

        for (i in S.indices) {
            if (S[i] == C) {
                arr[i] = 0

                for (j in i + 1 until S.length) {
                    if (S[j] == C) break
                    arr[j] = j - i
                }

                for (j in i - 1 downTo 0) {
                    if (S[j] == C || arr[j] <= i - j) break
                    arr[j] = minOf(arr[j], i - j)
                }
            }
        }

        return arr
    }
}
