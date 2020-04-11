package com.leetcode

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
class P108 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? = binaryTree(nums)

    private fun binaryTree(nums: IntArray) = binaryTree(nums, 0, nums.lastIndex)

    private fun binaryTree(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) return null
        val m = (start + end) / 2
        return TreeNode(nums[m]).apply {
            left = binaryTree(nums, start, m - 1)
            right = binaryTree(nums, m + 1, end)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}