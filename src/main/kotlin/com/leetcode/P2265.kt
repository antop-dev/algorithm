package com.leetcode

// https://github.com/antop-dev/algorithm/issues/464
class P2265 {

    fun averageOfSubtree(root: TreeNode?): Int {
        return dfs(root)[2]
    }

    /**
     * DFS
     * @return [합계, 개수, 일치 개수]
     */
    fun dfs(node: TreeNode?): IntArray {
        if (node == null) return intArrayOf(0, 0, 0)
        val left = dfs(node.left)
        val right = dfs(node.right)
        val total = left[0] + right[0] + node.`val`
        val count = left[1] + right[1] + 1
        val average = total / count
        val valid = left[2] + right[2] + if (average == node.`val`) 1 else 0
        return intArrayOf(total, count, valid)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
