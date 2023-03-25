package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/472
class P154539 {
    fun solution(numbers: IntArray): IntArray {
        val answer = IntArray(numbers.size) { -1 }
        val stack = Stack<Int>()
        for (i in numbers.indices) {
            val n = numbers[i]
            while (!stack.empty() && numbers[stack.peek()] < n) {
                answer[stack.pop()] = n
            }
            stack.push(i)
        }
        return answer
    }
}
