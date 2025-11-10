package com.leetcode

// https://github.com/antop-dev/algorithm/issues/267
class P720 {
    fun longestWord(words: Array<String>): String {
        words.sort()
        val set = mutableSetOf<String>()
        set += ""

        var ans = ""
        for (word in words) {
            val take = word.take(word.lastIndex)
            if (take in set) {
                set += word
                if (word.length > ans.length) {
                    ans = word
                }
            }
        }
        return ans
    }
}
