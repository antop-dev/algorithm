package com.leetcode

// https://leetcode.com/problems/intersection-of-two-arrays/
class P349 {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val n1 = nums1.distinct().sorted()
        val n2 = nums2.distinct().sorted()

        var j = 0
        for (i in n1.indices) {
            for (k in j until  n2.size) {
                if (n1[i] == n2[k]) {
                    answer += n1[i]
                    j = k
                    break
                }
            }
        }

        return answer.toIntArray()
    }
}
