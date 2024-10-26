package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/596
class P2545 {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        val map = TreeMap<Int, IntArray> { o1, o2 -> o2 - o1 }
        score.forEach { map[it[k]] = it }
        return map.values.toTypedArray()
    }
}
