package com.leetcode

// https://github.com/antop-dev/algorithm/issues/280
class P48 {
    fun rotate(matrix: Array<IntArray>) {
        var p = 0
        var length = matrix.size
        while (length > 1) {
            rotate(matrix, p++, length)
            length -= 2
        }
    }

    private fun rotate(matrix: Array<IntArray>, p: Int, length: Int) {
        if (length == 1) return

        val max = p + length - 1
        val list = mutableListOf<Int>()

        for (i in p until p + length) list += matrix[p][i] // 1
        for (i in p + 1 until p + length) list += matrix[i][max] // 2
        for (i in p + length - 2 downTo p) list += matrix[max][i] // 3
        for (i in p + length - 2 downTo p + 1) list += matrix[i][p] // 4

        repeat(length - 1) {
            list.add(0, list.removeAt(list.lastIndex))
        }

        var k = 0
        for (i in p until p + length) matrix[p][i] = list[k++]
        for (i in p + 1 until p + length) matrix[i][max] = list[k++]
        for (i in p + length - 2 downTo p) matrix[max][i] = list[k++]
        for (i in p + length - 2 downTo p + 1) matrix[i][p] = list[k++]
    }

}
