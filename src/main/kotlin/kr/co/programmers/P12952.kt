package kr.co.programmers

import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/535
class P12952 {
    fun solution(n: Int): Int {
        return dfs(IntArray(n), 0)
    }

    private fun dfs(arr: IntArray, row: Int): Int {
        if (row == arr.size) { // n번째 행까지 퀸을 다 놓았다.
            return 1
        }
        var count = 0
        for (col in arr.indices) {
            // row 행, col 열에 퀸을 배치 시켜놓고 검사한다.
            arr[row] = col
            if (valid(arr, row)) {
                count += dfs(arr, row + 1)
            }
        }
        return count
    }

    // 현재 행의 퀸 위치와 이전 행들의 퀸 위치를 비교한다.
    private fun valid(arr: IntArray, currRow: Int): Boolean {
        for (prevRow in 0 until currRow) {
            if (arr[currRow] == arr[prevRow]) { // 같은 열이면 안됨
                return false
            }
            // 대각선 위치면 안됨 (기울기로 계산)
            if (abs(currRow - prevRow) == abs(arr[currRow] - arr[prevRow])) {
                return false
            }
        }
        return true
    }

}
