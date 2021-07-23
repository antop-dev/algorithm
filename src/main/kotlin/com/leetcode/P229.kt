package com.leetcode

// https://github.com/antop-dev/algorithm/issues/299
class P229 {
    fun majorityElement(nums: IntArray): List<Int> {
        var n1 = Int.MAX_VALUE
        var n2 = Int.MAX_VALUE
        var c1 = 0
        var c2 = 0

        for (n in nums) {
            if (n == n1) {
                c1++
            } else if (n == n2) {
                c2++
            } else if (c1 == 0) {
                n1 = n
                c1 = 1
            } else if (c2 == 0) {
                n2 = n
                c2 = 1
            } else {
                c1--
                c2--
            }
        }

        c1 = 0
        c2 = 0
        for (num in nums) {
            if (num == n1) c1++
            if (num == n2) c2++
        }

        val answer = mutableListOf<Int>()
        val times = nums.size / 3
        if (c1 > times) answer += n1
        if (c2 > times) answer += n2

        return answer
    }
}
