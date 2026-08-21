package com.leetcode

// https://github.com/antop-dev/algorithm/issues/777
class P1493 {
    fun longestSubarray(nums: IntArray): Int {
        var ans = 0
        var zeros = 0
        var l = 0
        var r = 0
        while (r < nums.size) {
            if (nums[r] == 0) {
                zeros++
            }
            // 0의 갯수가 1개 이하일 때까지 l 포인터를 당긴다.
            while (zeros > 1) {
                if (nums[l] == 0) {
                    zeros--
                }
                l++
            }
            ans = maxOf(ans, r - l)
            r++
        }
        return ans
    }
}
