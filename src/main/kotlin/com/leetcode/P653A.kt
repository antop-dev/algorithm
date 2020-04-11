package com.leetcode

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
class P653A {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        return scan(root!!, root, k)
    }

    private fun scan(root: TreeNode, node: TreeNode?, k: Int): Boolean {
        if (node == null) return false
        println("node = ${node.`val`}, search = ${k - node.`val`}")
        return search(root, node.`val`, k - node.`val`)
                || scan(root, node.left, k)
                || scan(root, node.right, k)
    }

    private fun search(root: TreeNode, i: Int, n: Int): Boolean {
        var node: TreeNode? = root
        while (node != null) {
            println("  node = ${node.`val`}, sum = ${i + node.`val`}")
            node = when {
                i == node.`val` // 이진 탐색 트리의 숫자는 중복되지 않는다
                        || n < node.`val` -> node.left
                n > node.`val` -> node.right
                else -> return true
            }
        }
        return false
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}