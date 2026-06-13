package com.leetcode

// https://github.com/antop-dev/algorithm/issues/756
class P2870 {
    fun minOperations(nums: IntArray): Int {
        val hash = nums.toTypedArray().groupingBy { it }.eachCount()
        var ans = 0
        for (v in hash.values) {
            val op = check(v)
            if (op == -1) {
                return -1
            }
            ans += op
        }
        return ans
    }

    private fun check(num: Int): Int {
        var op = 0
        var n = num
//        while (n > 4) {
//            n -= 3
//            op++
//        }
        // 4 이하의 수를 남기면서 3으로 나누기를 한번의 식으로 푼다.
        op += (n - 2) / 3
        n -= op * 3
        // 4 이하의 수가 남으면 판단
        op += when (n) {
            4 -> 2
            3, 2 -> 1
            else -> return -1
        }
        return op
    }
}
