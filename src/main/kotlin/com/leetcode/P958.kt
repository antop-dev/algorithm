package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/801
class P958 {
    fun isCompleteTree(root: TreeNode?): Boolean {
        val queue = LinkedList<Pair<TreeNode, Int>>()
        queue += root!! to 0

        var most = 1 // 현재 깊이에서 필요한 노드 개수 (2배씩 증가)
        while (queue.isNotEmpty()) {
            val n = queue.size
            var childIdx = 0 // 자식 노드들의 인덱스
            var prev = -1 // 현재 탐색중인 노드의 이전 인덱스
            repeat(n) {
                val (node, currIdx) = queue.poll()
                if (prev + 1 < currIdx) {
                    return false
                }

                node.left?.let { queue += it to childIdx }
                childIdx++
                node.right?.let { queue += it to childIdx }
                childIdx++

                prev = currIdx
            }
            // 다음 깊이의 노드들이 있다면 현재 깊이는 모두 채워져 있어야 한다.
            if (queue.isNotEmpty() && n < most) {
                return false
            }
            most *= 2
        }

        return true
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        override fun toString(): String {
            return `val`.toString()
        }
    }
}
