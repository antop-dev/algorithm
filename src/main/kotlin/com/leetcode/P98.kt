package com.leetcode

// https://leetcode.com/problems/validate-binary-search-tree/
class P98 {
    fun isValidBST(root: TreeNode?): Boolean {
        // DPS로 탐색하면서 리스트로 만든다.
        val list = mutableListOf<Int>().apply {
            dps(this, root)
        }
        // 오름차순인지 검사
        return verify(list)
    }

    private fun dps(list: MutableList<Int>, node: TreeNode?) {
        node?.run {
            node.left?.run { dps(list, this) }
            list.add(node.`val`)
            node.right?.run { dps(list, this) }
        }
    }

    private fun verify(list: MutableList<Int>): Boolean {
        for (i in 0 until list.lastIndex) {
            if (list[i] >= list[i + 1]) return false
        }
        return true
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}