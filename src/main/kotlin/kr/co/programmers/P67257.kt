package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/415
class P67257 {
    // 문자열이 숫자인지 판단하는 정규표현식
    val number = Regex("^[0-9]*$")
    // 연산자 우선 순위 경우의 수
    private val ops = listOf(
        arrayOf('*', '+', '-'),
        arrayOf('*', '-', '+'),
        arrayOf('+', '*', '-'),
        arrayOf('+', '-', '*'),
        arrayOf('-', '*', '+'),
        arrayOf('-', '+', '*')
    )

    fun solution(expression: String): Long {
        var answer = 0L
        for (op in ops) {
            val postfix = toPostfix(expression, op)
            var value = calculate(postfix)
            if (value < 0) value *= -1
            if (value > answer) {
                answer = value
            }
        }
        return answer
    }

    // 중위 표기법 → 후위 표기법
    private fun toPostfix(infix: String, op: Array<Char>): List<String> {
        val stack = Stack<Char>()
        val postfix = mutableListOf<String>()
        var num = 0

        for (ch in infix) {
            if (ch in '0'..'9') {
                num = (num * 10) + (ch - '0')
            } else {
                postfix += "$num"
                num = 0

                while (stack.isNotEmpty() && op.indexOf(stack.peek()) <= op.indexOf(ch)) {
                    postfix += "${stack.pop()}"
                }
                stack += ch
            }
        }
        // 남은 숫자와 연산자들 처리
        postfix += "$num"
        while (stack.isNotEmpty()) {
            postfix += "${stack.pop()}"
        }
        return postfix
    }

    // 후위 표기법으로 계산
    private fun calculate(postfix: List<String>): Long {
        val stack = Stack<Long>()
        for (v in postfix) {
            stack += if (v.matches(number)) {
                v.toLong()
            } else {
                val b = stack.pop()
                val a = stack.pop()
                when (v[0]) {
                    '+' -> a + b
                    '-' -> a - b
                    else -> a * b
                }
            }
        }
        return stack.pop()
    }

}
