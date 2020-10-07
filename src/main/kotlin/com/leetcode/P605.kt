package com.leetcode

// https://leetcode.com/problems/can-place-flowers/
class P605 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var c = 0
        var i = 0
        while (i < flowerbed.size) {
            when {
                flowerbed[i] == 1 -> i++
                i < flowerbed.lastIndex && (flowerbed[i] == 0 && flowerbed[i + 1] == 0) -> {
                    c++
                    i++
                }
                i == flowerbed.lastIndex && flowerbed[i] == 0 -> c++
            }
            i++
        }
        return c >= n
    }
}
