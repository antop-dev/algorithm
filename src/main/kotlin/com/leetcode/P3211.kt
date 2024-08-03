package com.leetcode

// https://github.com/antop-dev/algorithm/issues/573
class P3211 {
    fun validStrings(n: Int): List<String> {
        val ans = mutableListOf<String>()
        dfs(n, 0, 0, ans)
        return ans
    }

    private fun dfs(n: Int, len: Int, v: Int, ans: MutableList<String>) {
        if (n == len) {
            ans += v.toString(2).padStart(len, '0')
            return
        }
        if (len == 0 || v and 1 == 1) { // 마지막 자리가 1일 경우
            dfs(n, len + 1, v shl 1, ans) // + "0"
        }
        dfs(n, len + 1, (v shl 1) + 1, ans) // + "1"
    }

}
