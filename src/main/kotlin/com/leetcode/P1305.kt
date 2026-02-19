package com.leetcode

// https://github.com/antop-dev/algorithm/issues/724
class P1305 {
    fun getAllElements(root1: TreeNode?, root2: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        inorder(root1, list)
        inorder(root2, list)
        return list.sorted()
    }

    private fun inorder(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) {
            return
        }
        inorder(root.left, list)
        list += root.`val`
        inorder(root.right, list)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
