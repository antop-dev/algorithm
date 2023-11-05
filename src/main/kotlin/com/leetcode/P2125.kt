package com.leetcode

// https://github.com/antop-dev/algorithm/issues/519
class P2125 {
    fun numberOfBeams(bank: Array<String>): Int {
        var ans = 0
        var before = 0 // 이전 층의 머신 수
        for (floor in bank) {
            var count = 0 // 현재 층의 머신 수
            for (d in floor) {
                if (d == '1') { // 머신일 경우
                    if (before > 0) ans += before
                    count++
                }
            }
            if (count > 0) {
                before = count
            }
        }
        return ans
    }
}
