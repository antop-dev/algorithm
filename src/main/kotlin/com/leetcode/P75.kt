package com.leetcode

// https://github.com/antop-dev/algorithm/issues/334
class P75 {
    fun sortColors(nums: IntArray) {
        // 인덱스 번호가 컬러 번호
        // [0] = red
        // [1] = white
        // [2] = blue
        val counter = IntArray(3)
        for (color in nums) counter[color]++

        var j = 0
        for (color in counter.indices) {
            repeat(counter[color]) {
                nums[j++] = color
            }
        }
    }
}
