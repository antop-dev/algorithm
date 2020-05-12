package com.leetcode

import kotlin.math.min

// https://leetcode.com/problems/min-stack/
class P155 {
    var data: ListNode? = null

    // Push element x onto stack.
    fun push(x: Int) {
        data = ListNode(x).apply {
            min = if (data == null) x else {
                next = data
                min(x, data!!.min)
            }
        }
    }

    // Removes the element on top of the stack.
    fun pop() {
        data = data?.next
    }

    // Get the top element.
    fun top(): Int {
        return data!!.`val`
    }

    // Retrieve the minimum element in the stack.
    fun getMin(): Int {
        return data!!.min
    }

    class ListNode(var `val`: Int) {
        var min = Int.MIN_VALUE
        var next: ListNode? = null
    }

}
