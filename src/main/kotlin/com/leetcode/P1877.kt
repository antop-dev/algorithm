package com.leetcode

// https://github.com/antop-dev/algorithm/issues/328
class P1877 {

    fun minPairSum(nums: IntArray): Int {
        nums.sort()

        var max = 0
        var i = 0
        var j = nums.lastIndex
        while (i < j) {
            max = maxOf(max, nums[i] + nums[j])
            i++
            j--
        }
        return max
    }

}
