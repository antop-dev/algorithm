package com.leetcode

// https://github.com/antop-dev/algorithm/issues/787
class P1028 {
    fun recoverFromPreorder(traversal: String): TreeNode? {
        return dfs(traversal, 0, 0).first
    }

    private fun dfs(traversal: String, pos: Int, depth: Int): Pair<TreeNode?, Int> {
        // 값 파싱
        val (v, vPos) = parseValue(traversal, pos)
        val node = TreeNode(v)
        var i: Int = vPos
        // left
        val (leftNode, leftPos) = processChild(traversal, i, depth)
        node.left = leftNode
        i = leftPos
        // right
        val (rightNode, rightPos) = processChild(traversal, i, depth)
        node.right = rightNode
        i = rightPos

        return node to i
    }

    private fun parseValue(traversal: String, pos: Int): Pair<Int, Int> {
        var i = pos
        var v = 0
        while (i < traversal.length && traversal[i] in '0'..'9') {
            v = (v * 10) + (traversal[i] - '0')
            i++
        }
        return v to i
    }

    private fun processChild(traversal: String, pos: Int, depth: Int): Pair<TreeNode?, Int> {
        var i = pos
        var dash = 0
        // 대시 카운팅
        while (i < traversal.length && traversal[i] == '-') {
            dash++
            i++
        }
        return when {
            dash <= depth -> null to (i - dash) // 상위이거나 같은 레밸
            else -> dfs(traversal, i, depth + 1)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
