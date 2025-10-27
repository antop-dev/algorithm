package com.leetcode

// https://github.com/antop-dev/algorithm/issues/695
class P1718 {
    fun constructDistancedSequence(n: Int): IntArray {
        val ans = IntArray(n + n - 1)
        val used = BooleanArray(n + 1)
        dfs(n, ans, used, 0)
        return ans
    }

    private fun dfs(n: Int, arr: IntArray, used: BooleanArray, i: Int): Boolean {
        // 끝까지 채워진 경우
        if (i >= arr.size) {
            return true
        }
        // 현재 위치에 이미 값이 채워진 경우
        if (arr[i] != 0) {
            return dfs(n, arr, used, i + 1)
        }
        for (v in n downTo 1) {
            // v를 사용하지 않는 조건
            if (used[v] /* 숫자가 이미 쓰임 */
                || arr[i] != 0 /* arr[i] 자리에 숫자가 채워짐 */
                || (v > 1 && (i + v >= arr.size || arr[i + v] != 0)) /* arr[i + v] 자리에 숫자가 채워짐 */
            ) {
                continue
            }
            // 숫자 채우기
            arr[i] = v
            if (v > 1) arr[i + v] = v
            used[v] = true
            // 다음 위치 처리
            if (dfs(n, arr, used, i + 1)) {
                return true
            }
            // 백트래킹
            arr[i] = 0
            if (v > 1) arr[i + v] = 0
            used[v] = false
        }
        // 현재 위치(i)에 어떠한 숫자(v)도 채우지 못함
        return false
    }
}