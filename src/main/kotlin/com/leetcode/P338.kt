package com.leetcode

// https://github.com/antop-dev/algorithm/issues/104
class P338 {
    fun countBits(num: Int): IntArray {
        val array = IntArray(num + 1) { 0 }
        for (i in 1..num) {
            array[i] = array[i / 2] + (i % 2)
            println("$i\t${array[i]}")
        }
        return array
    }
}
