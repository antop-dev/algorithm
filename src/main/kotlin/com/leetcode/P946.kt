package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/736
class P946 {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var j = 0
        for (i in popped.indices) {
            val pop = popped[i]
            // 뽑으려는 숫자가 스택 맨위에 있을 때까지 pushed에서 스택에 넣는다.
            while ((stack.isEmpty() || stack.peek() != pop) && j < pushed.size) {
                stack += pushed[j++]
            }
            // 스택의 가장 위에 꺼내려는 숫자가 없으면 불가능
            if (stack.isEmpty() || stack.peek() != pop) {
                return false
            }
            // 가장 위에 숫자를 뽑는다.
            stack.pop()

        }
        return true // popped 대로 모두 다 꺼냈다.
    }
}
