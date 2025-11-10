package com.leetcode

// https://github.com/antop-dev/algorithm/issues/698
class P3191 {
    fun minOperations(nums: IntArray): Int {
        val n = nums.size
        var op = 0
        for (i in 0 until n - 2) {
            // i 위치의 값이 0이면 연속된 3개 뒤집기
            if (nums[i] == 0) {
                op++
                for (j in i..(i + 2)) {
                    nums[j] = if (nums[j] == 1) 0 else 1
                }
            }
        }
        // 뒤에 두개가 모두 1이면 모두 1이다.
        if (nums[n - 2] == 0 || nums[n - 1] == 0) {
            op = -1
        }
        return op
    }
}