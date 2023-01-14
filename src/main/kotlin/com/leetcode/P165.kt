package com.leetcode

// https://github.com/antop-dev/algorithm/issues/453
class P165 {
    fun compareVersion(version1: String, version2: String): Int {
        val v1 = version1.split(".").map { it.toInt() }
        val v2 = version2.split(".").map { it.toInt() }
        val len = maxOf(v1.size, v2.size)

        for (i in 0 until len) {
            val a = if (i < v1.size) v1[i] else 0
            val b = if (i < v2.size) v2[i] else 0
            if (a > b) {
                return 1
            } else if (a < b) {
                return -1
            }
        }
        return 0
    }

}
