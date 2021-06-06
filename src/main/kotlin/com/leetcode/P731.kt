package com.leetcode

// https://github.com/antop-dev/algorithm/issues/276
class P731 {
    private val bookings = mutableMapOf<Int, MutableList<Int>>()
    private val overlaps = mutableListOf<IntArray>()

    fun book(start: Int, end: Int): Boolean {
        for (overlap in overlaps) {
            if (check(start, end, overlap[0], overlap[1])) return false
        }

        for ((s, ends) in bookings) {
            var count = 0
            for (e in ends) {
                if (check(start, end, s, e)) {
                    if (++count >= 2) return false
                    overlaps += intArrayOf(maxOf(s, start), minOf(e, end))
                }
            }
        }

        bookings[start]?.apply { this += end } ?: run {
            bookings[start] = mutableListOf(end)
        }

        return true
    }

    private fun check(start: Int, end: Int, x: Int, y: Int): Boolean {
        return (start in x until y)
                || (end in (x + 1)..y)
                || (start <= x && y <= end)
                || (x <= start && end <= y)
    }

}
