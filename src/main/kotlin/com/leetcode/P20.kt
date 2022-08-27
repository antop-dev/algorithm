package com.leetcode

import java.util.LinkedList

// https://leetcode.com/problems/valid-parentheses/
class P20 {
    fun isValid(s: String): Boolean {
        val stack = LinkedList<Char>()
        for (ch in s) {
            when {
                // 여는 문자를 만나면 스택에 넣기
                ch in arrayOf('(', '{', '[') -> stack.push(ch)
                // 이후는 닫는 문자다.
                // 스택이 비어 있으면 닫는 괄호만 남아있다는 것
                stack.isEmpty() -> return false
                // 닫는 괄호와 여는 괄호 비교
                ch == ')' && stack.pop() != '(' -> return false
                ch == '}' && stack.pop() != '{' -> return false
                ch == ']' && stack.pop() != '[' -> return false
            }
        }
        return stack.isEmpty()
    }
}
