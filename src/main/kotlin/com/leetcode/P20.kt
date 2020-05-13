package com.leetcode

// https://leetcode.com/problems/valid-parentheses/
class P20 {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (c in s) {
            when (c) {
                // 여는 문자를 만나면 스택에 넣기
                '(', '[', '{' -> stack.push(c)
                // 닫는 문자를 만났을 때 판단
                ')' -> if (stack.pop() != '(') return false
                ']' -> if (stack.pop() != '[') return false
                '}' -> if (stack.pop() != '{') return false
                else -> return false
            }
        }
        return stack.isEmpty()
    }
}

// https://stackoverflow.com/a/60010142/13122945
private fun <T> MutableList<T>.push(item: T) = add(count(), item)
private fun <T> MutableList<T>.pop(): T? = if (this.count() > 0) removeAt(this.count() - 1) else null
private fun <T> MutableList<T>.peek(): T? = if (this.count() > 0) this[count() - 1] else null
