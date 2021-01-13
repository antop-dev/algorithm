package com.leetcode

// https://leetcode.com/problems/student-attendance-record-i/
class P551 {
    fun checkRecord(s: String): Boolean {
        var absent = 0
        var late = 0
        for (i in s.indices) {
            if (s[i] == 'L') {
                late++
            } else {
                late = 0
                if (s[i] == 'A') {
                    absent++
                }
            }
            if (absent > 1 || late >= 3) {
                return false
            }
        }
        return true
    }
}
