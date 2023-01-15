package com.leetcode

// https://github.com/antop-dev/algorithm/issues/454
class P162 {
    fun findPeakElement(nums: IntArray): Int {
        if (nums.size == 1) return 0
        val arr = IntArray(nums.size + 2) { Int.MIN_VALUE }
        for (i in nums.indices) arr[i + 1] = nums[i]
        return search(arr, 1, arr.size - 2) - 1
    }

    private fun search(arr: IntArray, l: Int, r: Int): Int {
        if (l > r) return -1
        val m = (l + r) / 2
        return when {
            arr[m] > arr[m - 1] && arr[m] > arr[m + 1] -> m
            else -> {
                val v = search(arr, l, m - 1)
                if (v > -1) v else search(arr, m + 1, r)
            }
        }
    }

}
