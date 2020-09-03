package com.leetcode

// https://leetcode.com/problems/predict-the-winner/
class P486 {
    fun PredictTheWinner(nums: IntArray): Boolean {
        if (nums.size <= 2) return true
        return predict(nums, 0, 0, nums.lastIndex, 1) >= 0
    }

    private fun predict(nums: IntArray, score: Int, l: Int, r: Int, t: Int): Int {
        if (l > r) return score
        return if (t % 2 == 0) { // p1
            maxOf(
                predict(nums, score + nums[l], l + 1, r, t * -1),
                predict(nums, score + nums[r], l, r - 1, t * -1)
            )
        } else { // p2
            minOf(
                predict(nums, score - nums[l], l + 1, r, t * -1),
                predict(nums, score - nums[r], l, r - 1, t * -1)
            )
        }
    }

}
