package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/253
class P77485 {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        // 숫자 채우기
        var n = 1
        val box = Array(rows + 1) { Array(columns + 1) { 0 } }
        for (i in 1 until box.size) {
            for (j in 1 until box[i].size) {
                box[i][j] = n++
            }
        }
        // 회전
        return IntArray(queries.size) { i -> rotate(box, queries[i]) }
    }

    private fun rotate(box: Array<Array<Int>>, q: IntArray): Int {
        var min = Int.MAX_VALUE
        val tmp = box[q[0] + 1][q[1]]

        for (i in q[0] + 1..q[2]) {
            box[i][q[1]] = if (i < q[2]) box[i + 1][q[1]] else box[i][q[1] + 1]
            min = minOf(min, box[i][q[1]])
        }
        for (j in q[1] + 1..q[3]) {
            box[q[2]][j] = if (j < q[3]) box[q[2]][j + 1] else box[q[2] - 1][j]
            min = minOf(min, box[q[2]][j])
        }
        for (i in q[2] - 1 downTo q[0]) {
            box[i][q[3]] = if (i > q[0]) box[i - 1][q[3]] else box[i][q[3] - 1]
            min = minOf(min, box[i][q[3]])
        }
        for (j in q[3] - 1 downTo q[1]) {
            box[q[0]][j] = if (j > q[1]) box[q[0]][j - 1] else tmp
            min = minOf(min, box[q[0]][j])
        }
        return min
    }

}
