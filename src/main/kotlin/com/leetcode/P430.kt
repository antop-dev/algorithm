package com.leetcode

// https://github.com/antop-dev/algorithm/issues/784
class P430 {
    fun flatten(root: Node?): Node? {
        dfs(root)
        return root
    }

    private fun dfs(root: Node?): Node? {
        var prev: Node? = null
        var node: Node? = root
        while (node != null) {
            if (node.child != null) {
                val last = dfs(node.child)
                val tmp = node.next
                node.next = node.child
                node.child?.prev = node
                node.child = null
                last?.next = tmp
                tmp?.prev = last
                node = last
            }
            prev = node
            node = node?.next
        }
        return prev
    }

    class Node(var `val`: Int) {
        var prev: Node? = null
        var next: Node? = null
        var child: Node? = null
    }
}
