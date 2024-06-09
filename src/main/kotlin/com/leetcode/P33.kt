package com.leetcode

// https://github.com/antop-dev/algorithm/issues/122
class P33 {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.lastIndex
        while (l <= r) {
            val m = (l + r) / 2
            if (nums[m] == target) return m
            if (nums[l] <= nums[m]) { // 왼쪽이 정렬되어 있음
                if (target in nums[l]..nums[m]) {
                    r = m - 1
                } else {
                    l = m + 1
                }
            } else { // 오른쪽이 정렬되어 있음
                if (target in nums[m]..nums[r]) {
                    l = m + 1
                } else {
                    r = m - 1
                }
            }
        }
        return -1
    }
}
