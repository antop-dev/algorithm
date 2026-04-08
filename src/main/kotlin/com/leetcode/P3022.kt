package com.leetcode

// https://github.com/antop-dev/algorithm/issues/739
class P3022 {
    fun firstUniqueFreq(nums: IntArray): Int {
        // 숫자(num)의 빈도(x)
        val hash1 = mutableMapOf<Int, Int>()
        for (num in nums) {
            hash1[num] = (hash1[num] ?: 0) + 1
        }
        // 빈도(x)의 빈도(y)
        val hash2 = mutableMapOf<Int, Int>()
        for (x in hash1.values) {
            hash2[x] = (hash2[x] ?: 0) + 1
        }
        // 숫자(num)에 대한 빈도(x)의 빈도(y)가 1개인 첫번째 숫자를 리턴
        for (num in nums) {
            if (hash2[hash1[num]] == 1) {
                return num
            }
        }
        return -1
    }
}
