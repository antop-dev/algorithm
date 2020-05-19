package com.leetcode

import kotlin.math.abs
import kotlin.math.max

// https://leetcode.com/problems/balanced-binary-tree/
class P110 {
    fun isBalanced(root: TreeNode?): Boolean {
        return root?.run {
            // 현재 노드의 왼쪽과 오른쪽의 깊이 차이가 1 이하
            abs(height(left) - height(right)) <= 1
                    // 하위 왼쪽, 오른쪽 노드들도 각각 밸런스가 맞아야 한다.
                    && isBalanced(left) && isBalanced(right)
        } ?: true
    }

    private fun height(node: TreeNode?): Int {
        return node?.run {
            max(height(node.left), height(node.right)) + 1
        } ?: 0
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}
