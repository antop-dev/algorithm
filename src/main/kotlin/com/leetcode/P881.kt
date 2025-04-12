package com.leetcode

// https://github.com/antop-dev/algorithm/issues/646
class P881 {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()

        var ans = 0
        var i = 0
        var j = people.lastIndex
        while (i <= j) {
            val sum = people[i] + people[j]
            if (sum <= limit) {
                i++
                j--
            } else {
                j--
            }
            ans++
        }
        return ans
    }
}
