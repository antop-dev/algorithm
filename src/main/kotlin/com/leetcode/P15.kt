package com.leetcode

// https://github.com/antop-dev/algorithm/issues/308
class P15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val set = HashSet<List<Int>>()
        for (i in 0 until nums.size - 2) {
            var j = i + 1
            var k = nums.lastIndex
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                when {
                    sum < 0 -> j++
                    sum > 0 -> k--
                    else -> {
                        set.add(listOf(nums[i], nums[j], nums[k]))
                        j++
                        k--
                    }
                }
            }
        }

        return set.toList()
    }

}
