package com.leetcode

// https://github.com/antop-dev/algorithm/issues/269
class P648 {
    fun replaceWords(dictionary: List<String>, sentence: String): String {
        val words = sentence.split(" ").toMutableList()
        for (i in words.indices) {
            for (d in dictionary) {
                if (words[i].startsWith(d)) {
                    words[i] = d
                }
            }
        }
        return words.joinToString(" ")
    }
}
