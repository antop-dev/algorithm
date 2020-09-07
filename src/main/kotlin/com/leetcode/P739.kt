package com.leetcode

// https://leetcode.com/problems/daily-temperatures/
class P739 {
    fun dailyTemperatures(T: IntArray): IntArray {
        val ans = Array(T.size) { 0 }

        for (i in 0 until T.lastIndex) {
            for (j in i + 1 until T.size) {
                if (T[i] < T[j]) {
                    ans[i] = j - i
                    break;
                }
            }
        }

        return ans.toIntArray()
    }
}
