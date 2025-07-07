package com.leetcode

// https://github.com/antop-dev/algorithm/issues/665
class P1980 {
    fun findDifferentBinaryString(nums: Array<String>): String {
        val max = (1 shl nums.size) - 1 // 2^n - 1
        val seen = BooleanArray(max + 1)
        for (binary in nums) {
            seen[binary.toInt(2)] = true
        }
        for (n in 0..max) {
            if (!seen[n]) {
                return n.toString(2).padStart(nums.size, '0')
            }
        }
        return ""
    }
}