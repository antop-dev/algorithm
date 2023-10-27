package com.leetcode

// https://leetcode.com/problems/valid-square
class P593 {
    fun validSquare(p1: IntArray, p2: IntArray, p3: IntArray, p4: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        val points = arrayOf(p1, p2, p3, p4)
        for (i in 0 until points.size - 1) {
            for (j in i + 1 until points.size) {
                set += distance(points[i], points[j])
            }
        }
        return 0 !in set && set.size == 2
    }

    private fun distance(a: IntArray, b: IntArray) =
        (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1])

}
