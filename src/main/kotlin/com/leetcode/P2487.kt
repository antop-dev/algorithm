package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/673
class P2487 {
    fun removeNodes(head: ListNode?): ListNode? {
        var root = head

        val stack = Stack<ListNode>()
        var node = head
        while (node != null) {
            // 스택에서 현재 노드보다 작은 노드를 모두 꺼낸다
            while (stack.isNotEmpty() && stack.peek().`val` < node.`val`) {
                stack.pop()
            }
            if (stack.isNotEmpty()) { // 남은 노드 뒤에 연결
                stack.peek().next = node
            } else { // 스택이 비어있으면 현재 노드가 루트 노드
                root = node
            }
            stack += node
            node = node.next
        }
        return root
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}