package com.leetcode

import java.util.PriorityQueue

// https://github.com/antop-dev/algorithm/issues/754
class P2583 {
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        val pq = PriorityQueue<Long>()
        val queue = ArrayDeque<TreeNode>()
        root?.let { queue += it }

        while (queue.isNotEmpty()) {
            var sum = 0L
            repeat(queue.size) {
                val node = queue.removeFirst()
                sum += node.`val`
                node.left?.let { queue += it }
                node.right?.let { queue += it }
            }
            pq += sum
            if (pq.size > k) {
                pq.poll()
            }
        }

        return when {
            k == pq.size -> pq.poll()
            else -> -1
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
