package com.leetcode

// https://github.com/antop-dev/algorithm/issues/558
class P306 {
    fun isAdditiveNumber(num: String): Boolean {
        if (num.length < 3) return false
        return dfs(num, 0, 0, 0, 0, 0)
    }

    private fun dfs(num: String, p: Int, d: Int, a: Int, b: Int, c: Int): Boolean {
        if (d >= 3) { // 깊이가 3 이상일 때부터 판단한다.
            // a + b != c
            if (a + b != c) return false
            // 끝까지 검증 됨
            if (p >= num.length) return true
        }

        var n = 0
        for (i in p until num.length) {
            n = (n * 10) + (num[i] - '0')
            if (dfs(num, i + 1, d + 1, b, c, n)) {
                return true
            }
            // 처음이 0이었다면 이후 수자는 조합되지 않는다. 0 -> 09 (x)
            if (n == 0) break
        }

        return false
    }

}
