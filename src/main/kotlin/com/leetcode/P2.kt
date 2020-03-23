package com.leetcode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class P2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // 코틀린에서 펑션의 인자는 상수다
        var node1: ListNode? = l1
        var node2: ListNode? = l2
        // 리턴할 노드
        var root: ListNode? = null

        var node: ListNode? = null
        // 두 수의 합이 10이 넘었다는 플래그
        // 이 값이 참이면 다음 노드의 합을 계산할 +1 해야 한다
        var over = false
        while (node1 != null || node2 != null) {
            val x = node1?.`val` ?: 0
            val y = node2?.`val` ?: 0
            var sum = x + y + if (over) 1 else 0

            over = sum >= 10
            if (over) sum %= 10

            val n = ListNode(sum)
            // if (root == null) { root = n }
            root = root ?: n

            node?.next = n // 다음 연결
            node = n // 현재 노드 교체

            // 다음 노드
            node1 = node1?.next
            node2 = node2?.next
        }

        if (over) {
            // 마지막 모든 노드를 처리 후 10의자리가 넘었을 경우
            node?.next = ListNode(1)
        }

        return root
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

