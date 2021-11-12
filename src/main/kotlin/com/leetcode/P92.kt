package com.leetcode

// https://github.com/antop-dev/algorithm/issues/346
class P92 {

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        // 배열에 넣음
        val list = mutableListOf<ListNode?>().apply {
            var node = head
            while (node != null) {
                this.add(node)
                node = node.next
            }
        }
        // 위치를 바꿈
        var l = left - 1
        var r = right - 1
        while (l < r) {
            val t = list[r]
            list[r] = list[l]
            list[l] = t
            l++
            r--
        }
        // 참조를 바꿈
        for (i in 0 until list.lastIndex) list[i]!!.next = list[i + 1]
        list[list.lastIndex]!!.next = null
        // 첫번째 노드를 리턴
        return list[0]
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "$`val`"
        }
    }
}
