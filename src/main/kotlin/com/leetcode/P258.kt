package com.leetcode

// https://leetcode.com/problems/add-digits/
class P258 {
    fun addDigits(num: Int): Int {
//        var n = num
//        var sum = 0
//        while (n > 0) {
//            sum += n % 10
//            n /= 10
//        }
//        return if (sum < 10) sum else addDigits(sum)

        return 1 + (num - 1) % 9
    }
}
