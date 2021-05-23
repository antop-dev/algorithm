package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/125
class P739 {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        val stack = Stack<Int>().apply { push(temperatures.lastIndex) }
        for (i in temperatures.lastIndex - 1 downTo 0) {
            while (stack.isNotEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop()
            }
            if (stack.isNotEmpty()) {
                answer[i] = stack.peek() - i
            }
            stack.push(i)
        }
        return answer
    }
}
