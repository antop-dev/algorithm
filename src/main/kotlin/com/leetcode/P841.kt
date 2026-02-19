package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/725
class P841 {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val queue = LinkedList<Int>().apply { this += 0 }
        val visited = mutableSetOf<Int>()
        while (queue.isNotEmpty()) {
            val room = queue.poll()
            if (room in visited) {
                continue
            }
            visited += room
            for (next in rooms[room]) {
                queue += next
            }
        }
        return visited.size == rooms.size
    }
}
