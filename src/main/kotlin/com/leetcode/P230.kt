package com.leetcode

// https://github.com/antop-dev/algorithm/issues/274
class P230 {
    val list = mutableListOf<Int>()

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        inOrder(root)
        return list[k - 1]
    }

    private fun inOrder(root: TreeNode?) {
        root?.run {
            left?.run { inOrder(this) }
            list += `val`
            right?.run { inOrder(this) }
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        override fun toString(): String {
            return "$`val`"
        }
    }

}
