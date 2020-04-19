package com.leetcode

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
class P235 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        val path1 = path(root!!, p!!)
        val path2 = path(root, q!!)
        println()
        println("path1 = ${path1.contentToString()}, path2 = ${path2.contentToString()}")

        for (i in path1.lastIndex downTo 0) {
            for (j in path2.lastIndex downTo 0) {
                if (path1[i] == path2[j]) return TreeNode(path1[i])
            }
        }
        return null
    }

    // 재귀의 시작
    private fun path(root: TreeNode, target: TreeNode): IntArray {
        println()
        println("find path = ${target.`val`}")
        val list = mutableListOf<Int>()
        search(list, root, target.`val`);
        return list.toIntArray()
    }

    // 재귀 (꼬리)
    private fun search(list: MutableList<Int>, node: TreeNode?, target: Int): Boolean {
        if (node == null) return false
        println("  search node = ${node.`val`}")
        if (node.`val` == target // 현재 내 노드가 타겟과 같거나
                || search(list, node.left, target) // 내 왼쪽 노드를 탐색해서 참이 나오거나
                || search(list, node.right, target) // 내 오른쪽 노드를 탐색해서 참이 나오거나
        ) {
            list.add(0, node.`val`) // 리스트의 앞에 삽입
            return true
        }
        return false
    }

    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}