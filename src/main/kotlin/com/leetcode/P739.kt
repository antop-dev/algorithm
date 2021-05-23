package com.leetcode

// https://leetcode.com/problems/daily-temperatures/
class P739 {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val size = temperatures.size
        val tmp = IntArray(size)
        val answer = IntArray(size)
        for (i in 1 until size) {
            if (temperatures[i - 1] < temperatures[i]) {
                for (j in i - 1 downTo 0) {
                    if (tmp[j] > -1 && temperatures[j] < temperatures[i]) {
                        tmp[j] = -1
                        answer[j] = i - j
                    }
                }
            }
        }
        return answer
    }
}
