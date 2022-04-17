package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/242
class P68645 {
    fun solution(n: Int): IntArray {
        val box = Array(n) { IntArray(n) }
        var N = n
        var row = -1
        var col = 0
        var num = 1
        while (N > 0) {
            repeat(N) { box[++row][col] = num++ }
            repeat(N - 1) { box[row][++col] = num++ }
            repeat(N - 2) { box[--row][--col] = num++ }
            N -= 3
        }
        // 0을 제외하고 2차원 배열을 1차원 배열로 합치기
        return box.flatMap { it.filter { n -> n != 0 } }.toIntArray()
    }

}
