package com.leetcode

// https://github.com/antop-dev/algorithm/issues/368
class P12949 {

    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val m = arr1.size
        val k = arr2.size
        val n = arr2[0].size
        val matrix = Array(m) { IntArray(n) }

        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                for (a in 0 until k) {
                    matrix[i][j] += arr1[i][a] * arr2[a][j]
                }
            }
        }

        return matrix
    }

}
