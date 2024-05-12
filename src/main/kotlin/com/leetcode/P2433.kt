package com.leetcode

// https://github.com/antop-dev/algorithm/issues/557
class P2433 {
    fun findArray(pref: IntArray): IntArray {
        val n = pref.size
        val ans = IntArray(n)
        ans[0] = pref[0]

        for (i in 1 until n) {
            ans[i] = pref[i] xor pref[i - 1]
        }
        return ans
    }

}
