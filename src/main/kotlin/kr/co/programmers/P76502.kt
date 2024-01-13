package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/259
class P76502 {
    fun solution(s: String): Int {
        var answer = 0
        for (i in s.indices) {
            if (validate(s, i)) {
                answer++
            }
        }
        return answer
    }

    // 괄호 검사
    private fun validate(s: String, i: Int): Boolean {
        val n = s.length
        val stack = Stack<Char>()
        for (k in i until i + n) {
            val ch = s[k % n]
            when {
                ch in arrayOf('[', '{', '(') -> stack.push(ch)
                // 이후부터는 닫는 괄호
                stack.isEmpty() -> return false
                ch == ']' && stack.pop() != '[' -> return false
                ch == '}' && stack.pop() != '{' -> return false
                ch == ')' && stack.pop() != '(' -> return false
            }
        }
        return stack.isEmpty()
    }
}
