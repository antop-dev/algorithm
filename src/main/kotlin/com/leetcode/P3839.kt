package com.leetcode

// https://github.com/antop-dev/algorithm/issues/745
class P3839 {
    fun numberOfPrefixConnectedGroups(words: Array<String>, k: Int): Int {
        return words.filter { it.length >= k }
            .groupingBy { it.substring(0, k) }
            .eachCount()
            .count { it.value >= 2 }
    }
}
