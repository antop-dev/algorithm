package com.leetcode

// https://github.com/antop-dev/algorithm/issues/385
class P90 {

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val answer = mutableListOf<List<Int>>().apply { this += listOf<Int>() }
        for (n in nums) {
            val size = answer.size
            for (i in 0 until size) {
                val l = answer[i].toMutableList().apply { this += n }
                if (!answer.contains(l)) {
                    answer += l
                }
            }
        }
        return answer
    }

}
