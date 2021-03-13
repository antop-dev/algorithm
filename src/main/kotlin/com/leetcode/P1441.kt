package com.leetcode

// https://github.com/antop-dev/algorithm/issues/166
class P1441 {

    fun buildArray(target: IntArray, n: Int): List<String> {
        val operations = mutableListOf<String>()

        var i = 1
        for (t in target) {
            while (i < t) {
                operations += "Push"
                operations += "Pop"
                i++
            }
            operations += "Push"
            i++
        }

        return operations
    }

}
