package com.leetcode

// https://leetcode.com/problems/summary-ranges/
class P228 {

    fun summaryRanges(nums: IntArray): List<String> {
        val answer = mutableListOf<String>()
        if (nums.isEmpty()) return answer

        var anchor = 0;
        for (i in nums.indices) {
            if (i < nums.lastIndex && nums[i] + 1 == nums[i + 1]) {
                continue
            } else {
                answer += if (anchor != i) "${nums[anchor]}->${nums[i]}" else "${nums[anchor]}"
                anchor = i + 1
            }
        }
        return answer
    }

}
