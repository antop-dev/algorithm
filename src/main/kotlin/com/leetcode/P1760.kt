package com.leetcode

// https://github.com/antop-dev/algorithm/issues/652
class P1760 {
    fun minimumSize(nums: IntArray, maxOperations: Int): Int {
        var left = 1
        var right = nums.max()
        var ans = right
        while (left < right) {
            val mid = (left + right) / 2
            print("x = $mid")
            if (verify(nums, mid, maxOperations)) {
                println(" -> ok")
                ans = minOf(ans, mid)
                right = mid
            } else {
                println(" -> no")
                left = mid + 1
            }
        }
        return ans
    }

    /**
     * 주머니에 들어있는 볼을 [x]개로 [maxOperations] 횟수 안으로 나눌 수 있는가?
     */
    private fun verify(nums: IntArray, x: Int, maxOperations: Int): Boolean {
        var count = 0
        for (num in nums) {
            count += (num / x) + (if (num % x > 0) 1 else 0) - 1
            if (count > maxOperations) {
                return false
            }
        }
        return true
    }
}