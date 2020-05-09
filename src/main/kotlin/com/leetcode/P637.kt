package com.leetcode

class P637 {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val answer = mutableListOf<Double>()
        root?.run {
            val queue = mutableListOf<TreeNode>()
            queue.add(root)

            while (queue.isNotEmpty()) {
                val size = queue.size
                var sum: Long = 0
                (1..size).onEach {
                    queue.pop()?.run {
                        sum += this.`val`
                        this.left?.run { queue.push(this) }
                        this.right?.run { queue.push(this) }
                    }
                }
                answer.add(sum.toDouble() / size)
            }
        }
        return answer.toDoubleArray()
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}

// queue-like
private fun <T> MutableList<T>.push(item: T) = add(count(), item)
private fun <T> MutableList<T>.pop(): T? = if (this.count() > 0) removeAt(0) else null
