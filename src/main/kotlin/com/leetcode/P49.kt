package com.leetcode

// https://github.com/antop-dev/algorithm/issues/298
class P49 {
    private val primes =
        intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101)

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs
            .groupBy { it.fold(1L) { acc, c -> acc * primes[c - 'a'] } }
            .map { it.value }
    }
}
