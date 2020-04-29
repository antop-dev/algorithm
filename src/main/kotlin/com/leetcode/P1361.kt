package com.leetcode

// https://leetcode.com/problems/validate-binary-tree-nodes/
class P1361 {
    fun validateBinaryTreeNodes(n: Int, leftChild: IntArray, rightChild: IntArray): Boolean {
        val array = Array(n) { intArrayOf(0, 0) }
        for (i in 0 until n) {
            if (leftChild[i] > -1) {
                array[i][0]++
                array[leftChild[i]][1]++
            }
            if (rightChild[i] > -1) {
                array[i][0]++
                array[rightChild[i]][1]++
            }
        }

        return when {
            // 노드의 갯수가 1개면 패스
            n == 1 -> true
            // 시작 노드가 하나 있어야 한다.
            array.count { it[1] == 0 } != 1 -> false
            // 두개 이상의 노드에서 내 노드를 향할 수 없다.
            array.any { it[1] >= 2 } -> false
            // 간선이 없는 노드가 있으면 안된다.
            array.any { it[0] == 0 && it[1] == 0 } -> false
            else -> true
        }
    }
}