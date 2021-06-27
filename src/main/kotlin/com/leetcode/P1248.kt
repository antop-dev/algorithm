package com.leetcode

// https://github.com/antop-dev/algorithm/issues/284
class P1248 {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        // 홀수의 인덱스
        val odds = mutableListOf<Int>()
        odds += -1
        for (i in nums.indices) {
            if (nums[i] % 2 == 1) odds += i
        }
        odds += nums.size
        if (odds.size - 2 < k) return 0

        var count = 0
        for (i in 1 until odds.size - k) {
            count += (odds[i] - odds[i - 1]) * (odds[i + k] - odds[i + k - 1])
        }
        return count
    }
}
