package com.leetcode

// https://leetcode.com/problems/top-k-frequent-words/
class P692 {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = mutableMapOf<String, Int>()
        for (word in words) {
            map[word] = map[word]?.run { this + 1 } ?: 1
        }

        // https://www.baeldung.com/kotlin-sort
        val sorted = map.toList()
                .sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })

        return sorted.map { it.first }.take(k)
    }
}