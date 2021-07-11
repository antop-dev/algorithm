package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/294
class P394 {
    fun decodeString(s: String): String {
        val stack = Stack<String>()
        var n = 0
        for (c in s) {
            when (c) {
                in '0'..'9' -> n = (10 * n) + (c - '0')
                '[' -> {
                    stack.push(n.toString())
                    stack.push("$c")
                    n = 0
                }
                ']' -> {
                    // "["가 나오기 전까지 문자열 추출
                    val sb = StringBuffer()
                    var w: String?
                    while (stack.pop().also { w = it } != "[") {
                        sb.insert(0, w)
                    }
                    stack.push(sb.repeat(stack.pop().toInt()))
                }
                else -> stack.push("$c")
            }
        }
        return stack.joinToString("")
    }
}
