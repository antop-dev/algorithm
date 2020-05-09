package com.leetcode

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
class P107 {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()

        root?.run {
            val queue = mutableListOf<TreeNode>()
            queue.add(root)

            while (queue.isNotEmpty()) {
                mutableListOf<Int>().run list@{
                    (1..queue.size).onEach {
                        queue.pop()?.run {
                            this@list.add(this.`val`)
                            this.left?.run { queue.push(this) }
                            this.right?.run { queue.push(this) }
                        }
                    }
                    answer.add(0, this)
                }
            }
        }
        return answer
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}

// queue-like
private fun <T> MutableList<T>.push(item: T) = add(count(), item)
private fun <T> MutableList<T>.pop(): T? = if (this.count() > 0) removeAt(0) else null
