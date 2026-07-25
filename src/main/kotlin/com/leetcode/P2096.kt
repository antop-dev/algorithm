package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/768
class P2096 {
    fun getDirections(root: TreeNode?, startValue: Int, destValue: Int): String {
        val graph = graph(root)
        return find(graph, startValue, destValue)
    }

    private fun find(
        graph: Map<Int, List<Path>>,
        startValue: Int,
        destValue: Int
    ): String {
        val queue: Queue<Path> = LinkedList()
        queue += Path(startValue, "")

        val visited = mutableSetOf(startValue)
        // BFS
        while (queue.isNotEmpty()) {
            val (current, path) = queue.poll()
            if (current == destValue) {
                return path
            }
            graph[current]?.forEach { to ->
                if (to.v !in visited) {
                    visited.add(to.v)
                    queue.offer(Path(to.v, path + to.step))
                }
            }
        }

        return ""
    }

    private fun graph(root: TreeNode?): Map<Int, List<Path>> {
        val graph = mutableMapOf<Int, MutableList<Path>>()
        val queue = LinkedList<TreeNode>()
        queue += root!!

        while (queue.isNotEmpty()) {
            val node = queue.poll()
            node.left?.let {
                addPath(graph, node, it, "L")
                queue += it
            }
            node.right?.let {
                addPath(graph, node, it, "R")
                queue += it
            }
        }
        return graph
    }

    private fun addPath(
        graph: MutableMap<Int, MutableList<Path>>,
        from: TreeNode,
        to: TreeNode,
        path: String
    ) {
        val p = Path(to.`val`, path)
        graph[from.`val`]?.let { it += p } ?: run { graph[from.`val`] = mutableListOf(p) }
        val u = Path(from.`val`, "U")
        graph[to.`val`]?.let { it += u } ?: run { graph[to.`val`] = mutableListOf(u) }
    }

    data class Path(val v: Int, val step: String)

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
