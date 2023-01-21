package com.leetcode

import java.util.*


// https://github.com/antop-dev/algorithm/issues/457
class P373 {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        val queue = PriorityQueue<IntArray> { a, b -> a[0] + a[1] - b[0] - b[1] }
        for (i in 0 until minOf(nums1.size, k)) {
            queue += intArrayOf(nums1[i], nums2[0], 0)
        }

        while (answer.size < k && queue.isNotEmpty()) {
            val v = queue.poll()
            answer += listOf(v[0], v[1])
            // // nums2에 있는 다음 값을 큐에 넣는다
            if (v[2] == nums2.size - 1) continue
            queue += intArrayOf(v[0], nums2[v[2] + 1], v[2] + 1)
        }

        return answer
    }
}
