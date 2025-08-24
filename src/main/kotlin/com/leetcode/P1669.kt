package com.leetcode

// https://github.com/antop-dev/algorithm/issues/682
class P1669 {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        val ans = list1
        var l1 = list1
        var l2 = list2
        // x 찾기
        repeat(a - 1) { l1 = l1?.next }
        val x = l1
        // y 찾기
        repeat(b - a + 2) { l1 = l1?.next }
        val y = l1
        // list1의 a-1 노드 → x
        x?.next = l2
        // list2의 마지막 노드까지 이동
        while (l2?.next != null) { l2 = l2.next }
        // 마지막 list2 → y
        l2?.next = y

        return ans
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}