package com.leetcode

// https://github.com/antop-dev/algorithm/issues/797
class P133 {
    fun cloneGraph(node: Node?): Node? {
        val hash = mutableMapOf<Int, Node>()
        return dfs(hash, node)
    }

    private fun dfs(
        hash: MutableMap<Int, Node>,
        node: Node?
    ): Node? {
        if (node == null) {
            return null
        }
        // 해시에 복사된 노드가 없으면 새로 생성
        val newNode = hash[node.`val`] ?: Node(node.`val`)
        hash[node.`val`] = newNode
        // 이웃들 처리
        for (neighbor in node.neighbors) {
            if (neighbor == null) {
                continue
            }
            val newNeighbor = hash[neighbor.`val`] ?: dfs(hash, neighbor)
            newNode.neighbors += newNeighbor
        }
        // 복사된 노드를 리턴
        return newNode
    }

    class Node(var `val`: Int) {
        var neighbors: ArrayList<Node?> = ArrayList()
    }
}
