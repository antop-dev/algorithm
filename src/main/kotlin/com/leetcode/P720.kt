package com.leetcode

// https://github.com/antop-dev/algorithm/issues/267
class P720 {

    fun longestWord(words: Array<String>): String {
        val root = TrieNode()
        var answer = ""

        words.sortWith(
            Comparator<String> { o1, o2 -> o1.length - o2.length }
                .then(Comparator { o1, o2 -> if (o1 < o2) -1 else 1 })
        )

        word@ for (word in words) {
            var node = root
            for (i in word.indices) {
                val idx = word[i] - 'a'

                if (node.children[idx] != null) {
                    node = node.children[idx]!!
                    continue
                }

                if (i < word.lastIndex) continue@word
                if (i == word.lastIndex) {
                    if (word.length > answer.length) answer = word
                    val newNode = TrieNode(word[i])
                    node.children[idx] = newNode
                    node = newNode
                }
            }
        }
        return answer
    }

    class TrieNode(val char: Char? = null) {
        val children = Array<TrieNode?>(26) { null }
    }

}
