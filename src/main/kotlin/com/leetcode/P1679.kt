package com.leetcode

// https://github.com/antop-dev/algorithm/issues/364
class P1679 {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()

        var answer = 0
        var i = 0
        var j = nums.lastIndex
        while (i < j) {
            val sum = nums[i] + nums[j]
            if (sum == k) {
                answer++
                i++
                j--
            } else if (sum < k) {
                i++
            } else { // sum > k
                j--
            }
        }

        return answer
    }
}
