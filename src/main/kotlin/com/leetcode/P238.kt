package com.leetcode

// https://github.com/antop-dev/algorithm/issues/261
class P238 {

    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)

        var p = 1
        for (i in nums.indices) {
            answer[i] = p * nums[i]
            p *= nums[i]
        }

        p = 1
        for (i in nums.lastIndex downTo 1) { // i = nums.lastIndex ; i >= 1 ; i--
            answer[i] = answer[i - 1] * p
            p *= nums[i]
        }
        answer[0] = p

        return answer
    }

}
