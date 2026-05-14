package com.leetcode

import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/747
class P1026 {
    fun maxAncestorDiff(root: TreeNode?): Int {
        if (root == null) return 0 // 노드는 최소 2개 이상 들어온다.
        val (diff) = dfs(root)
        return diff
    }

    private fun dfs(root: TreeNode): IntArray {
        val currVal = root.`val`
        val (leftDiff, leftMin, leftMax) = root.left?.let { dfs(it) } ?: intArrayOf(0, currVal, currVal)
        val (rightDiff, rightMin, rightMax) = root.right?.let { dfs(it) } ?: intArrayOf(0, currVal, currVal)
        val min = minOf(leftMin, rightMin)
        val max = maxOf(leftMax, rightMax)
        val diff = maxOf(
            abs(currVal - min),
            abs(currVal - max),
            maxOf(leftDiff, rightDiff),
        )
        return intArrayOf(
            diff,
            minOf(min, currVal),
            maxOf(max, currVal),
        )
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
