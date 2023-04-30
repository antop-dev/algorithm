package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/484
class P316 {
    fun removeDuplicateLetters(s: String): String {
        // 각 문자들의 마지막 인덱스 위치
        val lastIndex = IntArray(26)
        // 각 문자 처리 완료 여부
        val seen = BooleanArray(26)
        // 각 문자의 마지막 인덱스 기록
        for (i in s.indices) {
            lastIndex[s[i] - 'a'] = i
        }

        val stack = Stack<Int>()
        for (i in s.indices) {
            val curr = s[i] - 'a'
            if (seen[curr]) continue
            while (stack.isNotEmpty()
                && stack.peek() > curr
                && i < lastIndex[stack.peek()]
            ) {
                seen[stack.pop()] = false
            }
            stack.push(curr)
            seen[curr] = true
        }
        // 문자열로 바꾸기
        val sb = StringBuilder()
        while (stack.isNotEmpty()) {
            sb.append((stack.pop() + 97).toChar())
        }
        return sb.reversed().toString()
    }
}
