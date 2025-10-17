package com.leetcode

// https://github.com/antop-dev/algorithm/issues/693
class P1861 {
    fun rotateTheBox(boxGrid: Array<CharArray>): Array<CharArray> {
        val m = boxGrid.size
        val n = boxGrid[0].size
        val rotatedBox = Array(n) { CharArray(m) { '.' } }
        for (j in 0 until m) { // 올린 상자의 1열부터
            val y = m - 1 - j // 돌려진 박스 i 좌표에 대응되는 돌려지긴 전 y 좌표
            var anchor = n - 1
            for (i in n - 1 downTo 0) {
                if (rotatedBox[anchor][j] == '.' && boxGrid[y][i] == '#') {
                    rotatedBox[anchor][j] = '#'
                    anchor--
                } else if (boxGrid[y][i] == '*') {
                    rotatedBox[i][j] = '*'
                    anchor = i - 1
                }
            }
        }
        return rotatedBox
    }
}