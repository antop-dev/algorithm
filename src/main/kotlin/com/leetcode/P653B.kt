package com.leetcode

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
class P653B {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val values = mutableListOf<Int>()
        scan(values, root)
        println("k = $k, values = $values")

        for (i in 0 until values.lastIndex) {
            for (j in i + 1..values.lastIndex) {
                println("${values[i]} + ${values[j]} = ${values[i] + values[j]}")
                if (values[i] + values[j] == k) return true
            }
        }
        return false
    }

    private fun scan(values: MutableList<Int>, node: TreeNode?) {
        if (node == null) return
        scan(values, node.left)
        values.add(node.`val`)
        scan(values, node.right)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}