package com.leetcode

// https://github.com/antop-dev/algorithm/issues/478
class P61 {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null) return null

        var root = head
        var count = 1
        var temp: ListNode? = root
        while (temp?.next != null) {
            count++ // 노드의 길이 구하기
            temp = temp.next // 마지막 노드까지 찾아놓기
        }
        temp!!.next = root // 마지막 노드 → 연결 → 첫번째 노드

        var K = k % count
        if (K == count) return root
        K = count - K - 1 // K번째 노드를 마지막 노드로 한다.

        temp = head // 첫번째 노드부터 시작
        repeat(K) { temp = temp!!.next } // 마지막 노드로 찾아가기

        root = temp?.next // 리턴 시켜야 하는 시작 노드를 마지막 노드 다음 노드로 설정
        temp!!.next = null // 마지막 노드에서 다음 노드로의 참조를 삭제

        return root
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
