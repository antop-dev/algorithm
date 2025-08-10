package com.leetcode

// https://github.com/antop-dev/algorithm/issues/678
class P784 {
    fun letterCasePermutation(s: String): List<String> {
        val list = mutableListOf<String>()
        dfs(s, 0, StringBuilder(), list)
        return list
    }

    private fun dfs(s: String, i: Int, sb: StringBuilder, list: MutableList<String>) {
        if (i == s.length) {
            list += sb.toString()
            return
        }
        val ch = s[i]
        if (ch in 'a'..'z' || ch in 'A'..'Z') { // 문자
            // 소문자
            dfs(s, i + 1, sb.append(ch.lowercase()), list)
            sb.setLength(sb.length - 1) // backtracking
            // 대문자
            dfs(s, i + 1, sb.append(ch.uppercase()), list)
            sb.setLength(sb.length - 1) // backtracking
        } else { // 숫자
            dfs(s, i + 1, sb.append(ch), list)
            sb.setLength(sb.length - 1) // backtracking
        }
    }
}