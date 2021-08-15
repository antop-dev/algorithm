package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/294
class P394 {
    fun decodeString(s: String): String {
        val queue: Deque<Char> = ArrayDeque()
        for (c in s.toCharArray()) queue.add(c)
        return recursion(queue)
    }

    private fun recursion(queue: Queue<Char>): String {
        val ans = StringBuilder()
        var num = 0
        loop@ while (queue.isNotEmpty()) {
            when (val c = queue.poll()) {
                in '0'..'9' -> num = (num * 10) + (c - '0')
                '[' -> {
                    val temp = recursion(queue)
                    repeat(num) { ans.append(temp) }
                    num = 0
                }
                ']' -> break@loop
                else -> ans.append(c)
            }
        }
        return ans.toString()
    }

}
