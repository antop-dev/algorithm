package com.leetcode

// https://leetcode.com/problems/crawler-log-folder/
class P1598 {
    fun minOperations(logs: Array<String>): Int {
        var answer = 0
        for (log in logs) {
            answer += when (log) {
                "./" -> 0
                "../" -> -1
                else -> 1
            }
            if (answer < 0) answer = 0
        }
        return answer
    }
}
