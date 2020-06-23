package com.leetcode

// https://leetcode.com/problems/intersection-of-two-linked-lists/
class P160 {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var pa = headA // pointer a
        var pb = headB // pointer b

        var c = 0
        while (pa != pb) {
            pa = pa?.run { next } ?: run {
                c++
                headB
            }
            pb = pb?.run { next } ?: run {
                c++
                headA
            }
            if (c > 2) return null
        }
        return pa
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
