package com.leetcode

// https://github.com/antop-dev/algorithm/issues/704
class P930 {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
        val n = nums.size
        // 누적합
        val prefixSum = IntArray(n + 1)
        for (i in 0 until n) {
            prefixSum[i + 1] += prefixSum[i] + nums[i]
        }
        // 합이 goal인 갯수 구하기
        var ans = 0
        for (i in 0 until n) {
            for (j in i until n) {
                val sum = prefixSum[j + 1] - prefixSum[i]
                if (sum == goal) {
                    ans++
                }
            }
        }
        return ans
    }
}