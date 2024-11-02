package com.leetcode

// https://github.com/antop-dev/algorithm/issues/519
class P2125 {
    fun numberOfBeams(bank: Array<String>): Int {
        var ans = 0
        var before = 0 // 이전 층의 머신 수
        for (floor in bank) {
            val count = floor.count { it == '1' }
            if (count > 0) {
                if (before > 0) {
                    ans += before * count
                }
                before = count
            }
        }
        return ans
    }
}
