package com.leetcode

// https://github.com/antop-dev/algorithm/issues/335
class P5 {
    fun longestPalindrome(s: String): String {

        print("  j")
        for (i in s.indices) print("  $i")
        println()

        print("i  ")
        for (c in s) print("  $c")
        println()

        val n = s.length
        var startIndex = 0
        var endIndex = 0
        val dp = Array(n) { IntArray(n) }
        // 한글자 체크
        for (i in 0 until n) dp[i][i] = 1
        // 두글자 체크
        for (i in 0 until n - 1) {
            if (s[i] == s[i + 1]) {
                dp[i][i + 1] = 1
                startIndex = i
                endIndex = i + 1
            }
        }
        // ↘ 탐색
        for (start in 2 until n) {
            var i = 0
            var j = start
            while (j < n) {
                if (s[i] == s[j] && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1
                    if (j - i > endIndex - startIndex) {
                        startIndex = i
                        endIndex = j
                    }
                }
                i++
                j++
            }
        }

        for (i in dp.indices) {
            println("$i ${s[i]} ${dp[i].contentToString()}")
        }



        // substring
        val sb = StringBuilder()
        for (i in startIndex..endIndex) sb.append(s[i])
        return sb.toString()
    }
}
