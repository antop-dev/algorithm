package com.leetcode

// https://github.com/antop-dev/algorithm/issues/327
class P654 {
    fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {
        return constructMaximumBinaryTree(nums, 0, nums.lastIndex)
    }

    private fun constructMaximumBinaryTree(nums: IntArray, l: Int, r: Int): TreeNode? {
        if (l > r) return null
        if (l == r) return TreeNode(nums[l])

        var maxIndex = r
        for (i in l until r) {
            if (nums[i] > nums[maxIndex]) maxIndex = i
        }
        return TreeNode(nums[maxIndex]).apply {
            left = constructMaximumBinaryTree(nums, l, maxIndex - 1)
            right = constructMaximumBinaryTree(nums, maxIndex + 1, r)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}
