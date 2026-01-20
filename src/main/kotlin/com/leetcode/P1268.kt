package com.leetcode

// https://github.com/antop-dev/algorithm/issues/714
class P1268 {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        val trie = Trie().apply { products.forEach { insert(it) } }
        return searchWord.mapIndexed { i, _ ->
            val keyword = searchWord.take(i + 1)
            trie.search(keyword)
        }
    }

    class Trie {
        val root = Node()

        fun insert(word: String) {
            var node = root
            for (i in word.indices) {
                val ch = word[i]
                node = node.child[ch - 'a'] ?: run {
                    val newNode = Node()
                    node.child[ch - 'a'] = newNode
                    newNode
                }
                if (i == word.lastIndex) {
                    node.endOfWord = true
                }
            }
        }

        fun search(keyword: String): List<String> {
            val node = findNode(keyword) ?: return emptyList()
            val result = mutableListOf<String>()
            collectTopThreeWords(result, node, keyword)
            return result
        }

        /** [prefix]까지 노드를 찾는다 */
        private fun findNode(prefix: String): Node? {
            var node = root
            for (ch in prefix) {
                node.child[ch - 'a']?.let { node = it } ?: return null
            }
            return node
        }

        /** 현재 [node]에서부터 완성된 문자열 3개를 DFS로 찾는다 */
        private fun collectTopThreeWords(result: MutableList<String>, node: Node, word: String) {
            if (result.size == 3) {
                return
            }
            if (node.endOfWord) {
                println("word = $word")
                result += word
            }
            for (ch in 'a'..'z') {
                val child = node.child[ch - 'a'] ?: continue
                collectTopThreeWords(result, child, word + ch)
            }
        }

        class Node(
            val child: Array<Node?> = Array(26) { null },
            var endOfWord: Boolean = false
        )
    }
}
