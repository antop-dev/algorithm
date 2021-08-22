package com.leetcode

// https://github.com/antop-dev/algorithm/issues/316
class P79 {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (dfs(board, i, j, word, 0)) {
                    return true
                }
            }
        }
        return false
    }

    private fun dfs(board: Array<CharArray>, i: Int, j: Int, word: String, k: Int): Boolean {
        // 행의 인덱스가 벗어난 경우
        if (i !in board.indices) return false
        // 열의 인덱스가 벗어난 경우
        if (j !in board[0].indices) return false
        // 단어가 틀린 경우
        if (board[i][j] != word[k]) return false
        // 미지막 글자였으면 true
        if (k == word.lastIndex) return true
        // 방문 체크
        val temp = board[i][j]
        board[i][j] = ' '

        return if (dfs(board, i - 1, j, word, k + 1) // ↑
            || dfs(board, i + 1, j, word, k + 1) // ↓
            || dfs(board, i, j - 1, word, k + 1) // ←
            || dfs(board, i, j + 1, word, k + 1) // →
        ) {
            true
        } else {
            // 지나갔던 경로들이 답이 아니었다면 다시 복구한다.
            board[i][j] = temp
            false
        }
    }

}
