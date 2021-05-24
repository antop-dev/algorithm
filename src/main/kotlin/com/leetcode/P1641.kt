package com.leetcode

// https://github.com/antop-dev/algorithm/issues/270
class P1641 {
    private val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    var answer = 0

    fun countVowelStrings(n: Int): Int {
        dfs(StringBuilder(), 0, n)
        return answer
    }

    private fun dfs(s: StringBuilder, i: Int, n: Int) {
        if (s.length == n) {
            answer++
            return
        }
        for (j in i until vowels.size) {
            dfs(s.append(vowels[j]), j, n)
            s.deleteCharAt(s.lastIndex)
        }
    }
}
