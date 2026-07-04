package com.leetcode

// https://github.com/antop-dev/algorithm/issues/759
class P3760 {
    fun maxDistinct(s: String): Int {
        val arr = IntArray(26)
        var ans = 0
        for (ch in s) {
            if (arr[ch - 'a'] == 0) {
                ans++
            }
            arr[ch - 'a']++
        }
        return ans
    }
}
