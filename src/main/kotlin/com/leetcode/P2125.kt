package com.leetcode

// https://github.com/antop-dev/algorithm/issues/519
class P2125 {
    fun numberOfBeams(bank: Array<String>): Int {
        val floors = bank.map { floor -> // 한 층의 머신 개수를 카운팅
            floor.count { it == '1' }
        }.filter { count -> // 머신이 있는 층만 필터링
            count > 0
        }
        // 두 개층 이상이어야 한다.
        if (floors.size <= 1) {
            return 0
        }
        // 계산
        var ans = 0
        for (i in 1 until floors.size) {
            ans += floors[i - 1] * floors[i]
        }
        return ans
    }
}
