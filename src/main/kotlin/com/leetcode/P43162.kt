package com.leetcode

// https://github.com/antop-dev/algorithm/issues/342
class P43162 {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        for (i in 0 until n) {
            if (computers[i][i] == 1) {
                // 갈수 있는 모든 노드를 탐색하면서 방문 체크
                dfs(computers, i)
                answer++
            }
        }
        return answer
    }

    private fun dfs(computers: Array<IntArray>, i: Int) {
        // 이미 탐색된 네트워크
        if (computers[i][i] == 0) return
        // 방문 체크
        computers[i][i] = 0
        for (j in computers.indices) {
            if (computers[i][j] == 1) dfs(computers, j)
        }
    }
}
