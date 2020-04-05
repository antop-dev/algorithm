package com.leetcode

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class P1011 {
    fun shipWithinDays(weights: IntArray, D: Int): Int {
        println("weights = ${weights.contentToString()}, D = $D")

        var s = weights.max()!!
        var e = weights.sum()
        println("capacity range = $s ~ $e")

        while (s < e) { // s와 e가 같아질 때까지 구한다.
            val capacity = (s + e) / 2
            if (D < calculate(weights, capacity)) {
                s = capacity + 1
            } else {
                e = capacity
            }
        }

        println()
        println("s = $s, e = $e")
        return s
    }

    private fun calculate(weights: IntArray, capacity: Int): Int {
        println()
        println("capacity = $capacity")
        var day = 1
        var sum = 0
        for (i in weights) {
            if (sum + i > capacity) {
                println(" -> D$day")
                sum = 0
                day++
            }
            sum += i
            print(" $i")
        }
        println(" -> D$day")
        return day
    }

}