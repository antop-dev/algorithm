package com.leetcode

// https://github.com/antop-dev/algorithm/issues/623
class P1253 {
    fun reconstructMatrix(upper: Int, lower: Int, colsum: IntArray): List<List<Int>> {
        val matrix = listOf(mutableListOf<Int>(), mutableListOf())
        var upperSum = 0
        var lowerSum = 0
        // 2인것은 1씩 채우고 나머지는 0으로 채운다.
        colsum.forEach { v ->
            if (v == 2) {
                matrix[0] += 1
                matrix[1] += 1
                upperSum++
                lowerSum++
            } else {
                matrix[0] += 0
                matrix[1] += 0
            }
        }

        // upper를 먼저 채우고 lower를 채운다.
        colsum.forEachIndexed { i, v ->
            if (v == 1) {
                if (upperSum < upper) {
                    matrix[0][i] = 1
                    upperSum++
                } else {
                    matrix[1][i] = 1
                    lowerSum++
                }
                // 넘친 경우
                if (upperSum > upper || lowerSum > lower) {
                    return listOf()
                }
            }
        }
        // upper 개수와 lower 수가 딱 맞아야 한다.
        if (upperSum != upper || lowerSum != lower) {
            return listOf()
        }

        println("colsum = ${colsum.contentToString()}")
        println("upper  = ${matrix[0]} → upperSum = $upperSum")
        println("lower  = ${matrix[1]} → lowerSum = $lowerSum")

        return matrix
    }
}
