package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/743
class P856 {
    fun scoreOfParentheses(s: String): Int {
        val stack = Stack<String>() // "(", ")", 스코어가 들어간다
        for (ch in s) {
            if (ch == '(') {
                stack += ch.toString()
            } else { // ')'
                var sum = 0
                while (stack.peek() != "(") { // "("를 만날때까지 스코어를 모두 더암
                    sum += stack.pop().toInt()
                }
                // 합계가 0이라면 중간에 스코어가 없었다는 것 -> "()" -> 1
                // 아니라면 중간에 스코어가 었다는 것 -> "( 스코어1 스코어2 )" -> (스코어1+스코어2) * 2
                sum = if (sum == 0) 1 else sum * 2
                stack.pop() // '(' 제거
                stack += sum.toString() // 계산된 점수 넣기
            }
        }
        return stack.sumOf { it.toInt() }
    }
}
