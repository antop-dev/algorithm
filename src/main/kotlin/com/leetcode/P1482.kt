package com.leetcode

// https://github.com/antop-dev/algorithm/issues/699
class P1482 {
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        var left = 1
        var right = bloomDay.max()
        var ans = Int.MAX_VALUE
        // 이진탐색
        while (left <= right) {
            val day = (left + right) / 2
            val made = check(bloomDay, k, day)
            if (made < m) { // 적게 만들었다
                left = day + 1
            } else { // 같거나 많이 만들었다.
                right = day - 1
                ans = minOf(ans, day)
            }
        }
        if (ans == Int.MAX_VALUE) {
            ans = -1
        }
        return ans
    }

    // [day]일에 몇개의 꽃다발을 만들 수 있는가?
    private fun check(bloomDay: IntArray, k: Int, day: Int): Int {
        var made = 0
        var count = 0
        for (d in bloomDay) {
            if (d <= day) {
                count++
            } else {
                count = 0
            }
            if (count >= k) {
                made++
                count = 0
            }
        }
        return made
    }
}