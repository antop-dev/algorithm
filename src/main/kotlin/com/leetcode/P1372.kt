package com.leetcode

import kotlin.math.abs

// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
class P1372 {
    fun longestZigZag(root: TreeNode?): Int {
        return maxOf(maxZigZag(root?.left, -1), maxZigZag(root?.right, 1))
    }

    fun maxZigZag(node: TreeNode?, direction: Int): Int {
        val length = abs(direction) // length of current node
        if (node == null) return length - 1
        return maxOf(
            maxZigZag(node.left, if (direction < 0) -1 else (length + 1) * -1),
            maxZigZag(node.right, if (direction > 0) 1 else length + 1)
        )
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}



