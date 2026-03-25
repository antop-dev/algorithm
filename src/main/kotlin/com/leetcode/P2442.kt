package com.leetcode

// https://github.com/antop-dev/algorithm/issues/733
class P2442 {
    fun countDistinctIntegers(nums: IntArray): Int {
        val set = mutableSetOf<Int>()
        for (num in nums) {
            set += num
            set += reverse(num)
        }
        return set.size
    }

    // 숫자 뒤집기
    private fun reverse(n: Int): Int {
        var num = n
        var rev = 0
        while (num > 0) {
            rev = (rev * 10) + (num % 10)
            num /= 10
        }
        return rev
    }
}
