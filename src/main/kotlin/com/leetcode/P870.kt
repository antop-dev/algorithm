package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/718
class P870 {
    fun advantageCount(nums1: IntArray, nums2: IntArray): IntArray {
        val n = nums1.size
        val ans = IntArray(n)
        val q1 = sortedIndexQueue(nums1)
        val q2 = sortedIndexQueue(nums2)
        repeat(n) outer@{
            val j = q2.poll()
            // nums2[j] 보다 큰 nums1[i] 값을 찾는다.
            repeat(q2.size) {
                val i = q1.poll()
                if (nums1[i] > nums2[j]) {
                    ans[j] = nums1[i]
                    return@outer
                } else {
                    q1.offer(i)
                }
            }
            // 몾 찾은 nums2[j]는 큐에 다시 넣는다.
            q2.offer(j)
        }
        // 못 찾은 자리는 1:1로 넣어준다
        while (q2.isNotEmpty()) {
            ans[q2.poll()] = nums1[q1.poll()]
        }
        return ans
    }

    // 값을 오름차순으로 인덱스를 리턴한다.
    private fun sortedIndexQueue(nums: IntArray): Queue<Int> {
        return nums.indices
            .sortedBy { nums[it] }
            .toCollection(LinkedList())
    }
}
