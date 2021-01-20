package com.leetcode

// https://leetcode.com/problems/reformat-phone-number/
class P1694 {
    fun reformatNumber(number: String): String {
        var ans = ""
        val s = number.replace(Regex("(-|\\s)"), "")
        var p = 0
        for (i in s.indices) {
            if ((i - p == 2 && s.length - i == 2) || i - p == 3) {
                ans += "-"
                p = i
            }
            ans += s[i]
        }
        return ans
    }
}
