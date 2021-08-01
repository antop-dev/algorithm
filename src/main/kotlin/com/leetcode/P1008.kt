package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/305
class P1008 {
    fun bstFromPreorder(preorder: IntArray): TreeNode? {
        val root = TreeNode(preorder[0])
        val stack = Stack<TreeNode>().apply { push(root) }

        for (i in 1 until preorder.size) {
            val n = preorder[i]
            if (n < stack.peek().`val`) {
                val t = stack.peek()
                t.left = TreeNode(n)
                stack.push(t.left)
            } else {
                var t = stack.pop()
                while (stack.isNotEmpty() && stack.peek().`val` < n) {
                    t = stack.pop()
                }
                t.right = TreeNode(n)
                stack.push(t.right)
            }
        }

        return root
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
