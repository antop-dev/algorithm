package com.leetcode

// https://leetcode.com/problems/lexicographically-smallest-equivalent-string/
class P1091 {
    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {
        val graph = graph(s1, s2)
        return buildString {
            baseStr.forEach {
                val ch = graph[it - 'a'].first.ch
                append(ch)
            }
        }
    }

    // 그래프 생성
    private fun graph(s1: String, s2: String): List<Node> {
        val graph = ('a'..'z').map { Node(it) }
        s1.zip(s2).forEach { (ch1, ch2) ->
            val node1 = graph[ch1 - 'a']
            val node2 = graph[ch2 - 'a']
            if (node1.first.ch < node2.first.ch) {
                node2.first.prev = node1.first
            } else if (node2.first.ch < node1.first.ch) {
                node1.first.prev = node2.first
            }
        }
        return graph
    }

    data class Node(val ch: Char, var prev: Node? = null) {
        // 참조의 가장 작은 캐릭터
        val first: Node
            get() {
                var current: Node = this
                while (current.prev != null) {
                    current = current.prev!!
                }
                return current
            }
    }
}
