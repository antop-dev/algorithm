package com.leetcode

// https://github.com/antop-dev/algorithm/issues/342
class P43162 {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var ans = 0
        for (c in 0 until n) {
            if (computers[c][c] == 1) {
                // DFS로 탐색하고 카운팅
                dfs(computers, c)
                ans++
            }
        }
        return ans
    }

    private fun dfs(computers: Array<IntArray>, c: Int) {
        // 이미 탐색된 컴퓨터
        if (computers[c][c] == 0) {
            return
        }
        // 방문 체크
        computers[c][c] = 0
        // 다른 컴퓨터로 탐색
        for (to in computers.indices) {
            if (computers[c][to] == 1) {
                dfs(computers, to)
            }
        }
    }
}
