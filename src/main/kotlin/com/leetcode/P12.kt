package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/302
class P12 {
    val map = TreeMap<Int, String> { o1, o2 -> o2 - o1 }.apply {
        this[1000] = "M"
        this[900] = "CM"
        this[500] = "D"
        this[400] = "CD"
        this[100] = "C"
        this[90] = "XC"
        this[50] = "L"
        this[40] = "XL"
        this[10] = "X"
        this[9] = "IX"
        this[5] = "V"
        this[4] = "IV"
        this[1] = "I"
    }

    fun intToRoman(num: Int): String {
        val sb = StringBuilder()
        var n = num
        for (e in map) {
            if (n < e.key) continue

            repeat(n / e.key) {
                sb.append(e.value)
            }

            n %= e.key
            if (n == 0) break
        }
        return sb.toString()
    }
}
