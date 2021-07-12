package com.leetcode

// https://github.com/antop-dev/algorithm/issues/296
class P17 {
    private val words = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")

    // answer
    private val combinations = mutableListOf<String>()

    fun letterCombinations(digits: String): List<String> {
        if (digits == "") return listOf()
        dfs(digits, 0, StringBuffer())
        return combinations
    }

    private fun dfs(digits: String, i: Int, sb: StringBuffer) {
        if (i == digits.length) {
            combinations += sb.toString()
            return
        }
        for (c in words[digits[i] - '0']) {
            sb.append(c)
            dfs(digits, i + 1, sb)
            sb.deleteCharAt(sb.lastIndex)
        }
    }
}
