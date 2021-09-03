package com.leetcode

// https://github.com/antop-dev/algorithm/issues/321
class P18 {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()

        val set = HashSet<List<Int>>()
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                // 2 pointer
                var k = j + 1
                var l = nums.lastIndex
                while (k < l) {
                    val sum = nums[i] + nums[j] + nums[k] + nums[l]
                    when {
                        sum < target -> k++
                        sum > target -> l--
                        else -> {
                            set.add(listOf(nums[i], nums[j], nums[k], nums[l]))
                            k++
                            l--
                        }
                    }
                } // k < l
            } // j
        } // i

        return set.toList()
    }
}
