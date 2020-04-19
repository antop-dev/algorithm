package com.leetcode

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
class P1022 {
    fun sumRootToLeaf(root: TreeNode?) = binary(root)

    private fun binary(node: TreeNode?, s: String = ""): Int {
        if (node == null) return 0
        return with(s + node.`val`) {
            when {
                node.left == null && node.right == null -> number(this) // leaf
                else -> binary(node.left, this) + binary(node.right, this) // note leaf
            }
        }
    }

    // 2진수(문자열)을 10진수(Int)로 변환
    private fun number(s: String): Int {
        if (s.isBlank()) return 0
        var n = 0
        var m = 1
        for (i in s.lastIndex downTo 0) {
            if (s[i] == '1') n += m
            m *= 2
        }
        return n
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}