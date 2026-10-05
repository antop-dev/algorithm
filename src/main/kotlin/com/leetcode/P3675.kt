package com.leetcode

// https://github.com/antop-dev/algorithm/issues/791
class P3675 {
    fun minOperations(s: String): Int {
        val count = IntArray(26)
        for (ch in s) {
            count[ch - 'a']++
        }
        var ans = 0
        for (i in 1..25) {
            if (count[i] > 0) {
                count[(i + 1) % 26]++
                ans++
            }
        }
        return ans
    }
}
