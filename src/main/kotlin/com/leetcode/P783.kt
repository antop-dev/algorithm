package com.leetcode

// https://leetcode.com/problems/minimum-distance-between-bst-nodes/
class P783 {
    fun minDiffInBST(root: TreeNode?): Int {
        // TreeNode -> List
        val nums = mutableListOf<Int>()
        scan(nums, root)
        println("nums = $nums")
        // 각 값들의 차이 중 최소 값을 구한다.
        var min = Int.MAX_VALUE
        for (i in 1..nums.lastIndex) {
            println("  ${nums[i]} - ${nums[i - 1]} = ${nums[i] - nums[i - 1]}")
            min = min.coerceAtMost(nums[i] - nums[i - 1])
        }
        return min
    }

    private fun scan(list: MutableList<Int>, node: TreeNode?) {
        node?.run {
            scan(list, node.left)
            list.add(node.`val`)
            scan(list, node.right)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}