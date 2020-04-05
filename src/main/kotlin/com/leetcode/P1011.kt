package com.leetcode

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class P1011 {
    fun shipWithinDays(weights: IntArray, D: Int): Int {
        println("weights = ${weights.contentToString()}, D = $D")
        var capacity = weights.max() ?: 1
        while (!possible(weights, capacity, D)) {
            capacity++
        }
        return capacity
    }

    private fun possible(weights: IntArray, capacity: Int, D: Int): Boolean {
        println()
        println("capacity = ${capacity}")
        var day = 1
        var sum = 0;
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
        return day <= D
    }

}