package com.leetcode

import java.util.LinkedList

// https://github.com/antop-dev/algorithm/issues/712
class P2337 {
    fun canChange(start: String, target: String): Boolean {
        val queue1 = LinkedList<Int>()
        val queue2 = LinkedList<Int>()
        // 문자가 있는 위치를 큐에 담는다.
        start.zip(target).forEachIndexed { i, value ->
            val (ch1, ch2) = value
            if (ch1 != '_') queue1 += i
            if (ch2 != '_') queue2 += i
        }
        // 'L'과 'R'의 갯수가 같아야 한다.
        if (queue1.size != queue2.size) {
            return false
        }

        while (queue1.isNotEmpty()) {
            val i = queue1.poll()
            val j = queue2.poll()
            // 문자열의 배치가 같아야 한다
            if (start[i] != target[j]) {
                return false
            }
            // 'L'은 오른쪽으로 이동할 수 없다
            if (start[i] == 'L' && i < j) {
                return false
            }
            // 'R'은 왼쪽으로 이동할 수 없다
            if (start[i] == 'R' && j < i) {
                return false
            }
        }

        return true
    }
}
