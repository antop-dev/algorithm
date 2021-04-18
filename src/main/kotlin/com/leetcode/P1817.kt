package com.leetcode

// https://github.com/antop-dev/algorithm/issues/236
class P1817 {

    fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray {
        val answer = Array(k) { 0 }
        val hash = HashMap<Int, HashSet<Int>>()

        for (log in logs) {
            // use id
            val id = log[0]
            // performed an action at the minute
            val time = log[1]

            val set = hash[id] ?: HashSet()
            set += time

            hash[id] = set
        }

        for (e in hash) answer[e.value.size - 1]++
        return answer.toIntArray()
    }

}
