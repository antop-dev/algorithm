package com.leetcode

// https://github.com/antop-dev/algorithm/issues/548
class P894 {

    fun allPossibleFBT(n: Int): List<TreeNode?> {
        if (n == 0) return listOf()
        if (n == 1) return listOf(TreeNode(0))

        val list = mutableListOf<TreeNode?>()
        // n = 7
        // left  = 1, 3, 5
        // right = 5, 3, 1
        for (left in 1 until n step 2) {
            val right = n - left - 1
            for (l in allPossibleFBT(left)) {
                for (r in allPossibleFBT(right)) {
                    val parent = TreeNode(0).apply {
                        this.left = l
                        this.right = r
                    }
                    list.add(parent)
                }
            }
        }
        return list
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}
