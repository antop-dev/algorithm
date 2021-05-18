package com.leetcode

import java.util.*

// https://leetcode.com/problems/daily-temperatures/
class P739 {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        val stack = Stack<Int>().apply { push(temperatures.lastIndex) }
        for (i in temperatures.lastIndex - 1 downTo 0) {
            var days = 0
            while (stack.isNotEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                val idx = stack.pop()
                days += answer[idx]
            }
            days = if (stack.isEmpty()) 0 else days + 1
            stack.push(i)
            answer[i] = days
        }
        return answer
    }
}
