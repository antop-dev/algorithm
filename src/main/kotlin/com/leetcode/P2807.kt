package com.leetcode

// https://github.com/antop-dev/algorithm/issues/510
class P2807 {
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        if (head == null) return null
        var node: ListNode? = head
        while (node != null) {
            val next = node.next ?: break
            val gcd = gcd(node.`val`, next.`val`)
            node.next = ListNode(gcd).apply { this.next = next }
            node = next
        }
        return head
    }

    private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
        override fun toString(): String {
            return "$`val`"
        }
    }
}
