package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/259
class P76502 {
    fun solution(s: String): Int {
        var answer = 0
        val chars = s.toCharArray().toMutableList()
        for (i in 0 until s.lastIndex) {
            // 검사
            if (validate(chars)) answer++
            // 회전
            chars += chars.removeAt(0)
        }

        return answer
    }

    private fun validate(chars: List<Char>): Boolean {
        val stack = Stack<Char>()
        for (c in chars) {
            when {
                c in arrayOf('[', '{', '(') -> stack.push(c)
                stack.isEmpty() -> return false
                c == ']' && stack.pop() != '[' -> return false
                c == '}' && stack.pop() != '{' -> return false
                c == ')' && stack.pop() != '(' -> return false
            }
        }
        return stack.isEmpty()
    }
}
