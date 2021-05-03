package com.leetcode

// https://github.com/antop-dev/algorithm/issues/247
class P540 {
    fun singleNonDuplicate(nums: IntArray): Int {
        return bs(nums, 0, nums.lastIndex)
    }

    private fun bs(nums: IntArray, l: Int, r: Int): Int {
        if (l > r) return 0
        if (l == r) return nums[l]
        val m = (l + r) / 2

        return if (m % 2 == 0) { // 짝수 인덱스일 경우
            if (nums[m] == nums[m + 1]) bs(nums, m + 2, r)
            else bs(nums, l, m)
        } else { // 홀수 인덱스일 경우
            if (nums[m] == nums[m - 1]) bs(nums, m + 1, r)
            else bs(nums, l, m - 1)
        }
    }

}
