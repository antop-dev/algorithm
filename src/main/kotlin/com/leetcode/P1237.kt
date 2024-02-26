package com.leetcode

// https://github.com/antop-dev/algorithm/issues/540
class P1237 {
    fun findSolution(customFunction: CustomFunction, z: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        for (x in 1..z) {
            for (y in 1..z) {
                if (customFunction.f(x, y) == z) {
                    ans += listOf(x, y)
                }
            }
        }
        return ans
    }

    interface CustomFunction {
        fun f(x: Int, y: Int): Int
    }
}
