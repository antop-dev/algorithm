package com.leetcode

// https://github.com/antop-dev/algorithm/issues/622
class P1382 {
    fun balanceBST(root: TreeNode?): TreeNode? {
        val list = mutableListOf<Int>()
        // 인오더로 탐색하여 정렬된 리스트 생성
        inOrder(list, root)
        // 정렬된 리스트로 다시 BST 생성
        return makeBST(list, 0, list.lastIndex)
    }

    private fun inOrder(list: MutableList<Int>, node: TreeNode?) {
        node?.let {
            inOrder(list, it.left)
            list += it.`val`
            inOrder(list, it.right)
        }
    }

    private fun makeBST(list: List<Int>, from: Int, to: Int): TreeNode? {
        if (from > to) {
            return null
        }
        val mid = (from + to) / 2
        return TreeNode(list[mid]).apply {
            left = makeBST(list, from, mid - 1)
            right = makeBST(list, mid + 1, to)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
