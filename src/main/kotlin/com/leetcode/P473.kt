package com.leetcode

// https://github.com/antop-dev/algorithm/issues/494
class P473 {
    fun makesquare(matchsticks: IntArray): Boolean {
        val sum = matchsticks.sum()
        // 모든 성냥의 길이가 4면으로 떨어지지 않으면 안됨
        if (sum % 4 > 0) return false
        val length = sum / 4
        // 길이가 긴 성냥순으로 정렬
        matchsticks.sortDescending()
        // 가장 긴 성냥의 길이가 한면의 길이보다 크면 안됨
        if (matchsticks[0] > length) return false
        // 4면
        val square = IntArray(4) { length }
        // DFS 탐색
        return dfs(matchsticks, 0, square)
    }

    private fun dfs(matchsticks: IntArray, i: Int, square: IntArray): Boolean {
        // 성냥을 모두 사용했을 때 4면을 전부 채웠는지 체크
        if (i >= matchsticks.size) {
            return square.all { it == 0 }
        }
        // 현재 성냥을 어느 면에 넣을지 선택
        for (j in square.indices) {
            if (square[j] >= matchsticks[i]) {
                square[j] -= matchsticks[i]
                if (dfs(matchsticks, i + 1, square)) {
                    return true
                }
                square[j] += matchsticks[i] // backtracking
            }
        }
        // 현재 성냥을 어느 면에도 넣지 못했으면 안됨
        return false
    }
}
