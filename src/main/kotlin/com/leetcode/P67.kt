package com.leetcode

import kotlin.math.max

// https://leetcode.com/problems/add-binary/
class P67 {
    fun addBinary(a: String, b: String): String {
        val sb = StringBuilder()
        var m = 1
        var u = 0
        val max = max(a.lastIndex, b.lastIndex)
        for (i in max downTo 0) {
            val x = with(i - max + a.length - 1) {
                if (this >= 0) a[this] - '0' else 0
            }
            val y = with(i - max + b.length - 1) {
                if (this >= 0) b[this] - '0' else 0
            }
            with(x + y + u) {
                sb.insert(0, if (this % 2 == 1) "1" else "0")
                u = if (this >= 2) 1 else 0
            }
            m *= 2
        }

        if (u == 1) sb.insert(0, u)
        return sb.toString()
    }

}