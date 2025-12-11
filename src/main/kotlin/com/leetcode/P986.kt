package com.leetcode

// https://github.com/antop-dev/algorithm/issues/706
class P986 {
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val ans = mutableListOf<IntArray>()
        var i = 0
        var j = 0
        while (i < firstList.size && j < secondList.size) {
            val (a1, a2) = firstList[i]
            val (b1, b2) = secondList[j]
            // 겹친다
            if (a1 <= b2 && b1 <= a2) {
                ans += intArrayOf(maxOf(a1, b1), minOf(a2, b2))
            }
            // 끝점이 더 작은 구간의 포인터를 이동
            if (a2 <= b2) {
                i++
            } else {
                j++
            }
        }
        return ans.toTypedArray()
    }
}