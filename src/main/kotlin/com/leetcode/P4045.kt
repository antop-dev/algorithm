package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/800
class P4045 {
    fun countGroups(position: IntArray, speed: IntArray, distance: Int): Int {
        val stack = Stack<Int>().apply { this += position.indices }
        var ans = 0
        while (stack.isNotEmpty()) {
            val i = stack.pop()
            // 나를 따라잡을 수 있는 로봇을 스택에서 빼기
            while (stack.isNotEmpty()) {
                val j = stack.peek()
                // 두 로롯이 distatanc 범위에 있는 것과 따라잡히는 것 둘 다 처리
                if (position[i] - position[j] <= distance || speed[j] > speed[i]) {
                    position[i] = position[j] // 연속으로 범위 안에 드는 걸 처리하기 위함
                    stack.pop()
                } else {
                    break // j가 i를 따라잡지 못한다.
                }
            }
            ans++
        }
        return ans
    }
}
