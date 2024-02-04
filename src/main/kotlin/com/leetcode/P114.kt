package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/536
class P114 {

    fun flatten(root: TreeNode?) {
        if (root == null) return
        // 전위(pre-order) 순위로 탕색하면서 스택에 넣는다.
        val stack = Stack<TreeNode>()
        dfs(root, stack)
        // 스택에서 하나씩 꺼내면서 참조를 변경 해준다.
        var prev: TreeNode? = null
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            node.left = null
            node.right = prev
            prev = node
        }
    }

    private fun dfs(node: TreeNode?, stack: Stack<TreeNode>) {
        node?.run {
            stack += this
            left?.let { dfs(it, stack) }
            right?.let { dfs(it, stack) }
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
