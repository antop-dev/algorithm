package com.leetcode

// https://github.com/antop-dev/algorithm/issues/799
class P454 {
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
        val hash = mutableMapOf<Int, Int>()
        for (i in nums1.indices) {
            for (j in nums2.indices) {
                val sum = nums1[i] + nums2[j]
                hash[sum] = hash[sum]?.let { it + 1 } ?: 1
            }
        }
        var ans = 0
        for (k in nums3.indices) {
            for (l in nums4.indices) {
                val sum = nums3[k] + nums4[l]
                hash[-sum]?.let { ans += it }
            }
        }
        return ans
    }
}
