package com.leetcode

// https://github.com/antop-dev/algorithm/issues/471
class P31 {
    fun nextPermutation(nums: IntArray): Unit {
        if (nums.size == 1) return
        var i = nums.size - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--
        }
        if (i >= 0) {
            var j = nums.lastIndex
            while (nums[j] <= nums[i]) {
                j--
            }
            swap(nums, i, j)
        }
        reverse(nums, i + 1, nums.lastIndex)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    private fun reverse(nums: IntArray, i: Int, j: Int) {
        var l = i
        var r = j
        while (l < r) {
            swap(nums, l++, r--)
        }
    }
}
