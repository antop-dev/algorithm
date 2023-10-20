package kr.co.programmers

// https://school.programmers.co.kr/learn/courses/30/lessons/87377
class P87377 {
    fun solution(line: Array<IntArray>): Array<String> {
        // 교점 좌표를 기록할 Set
        val set = mutableSetOf<Pair<Long, Long>>()
        // 가장자리 좌표
        var minX = Long.MAX_VALUE
        var maxX = Long.MIN_VALUE
        var minY = Long.MAX_VALUE
        var maxY = Long.MIN_VALUE
        // Int * Int = Long 이 될 수 있기 때문에 처음부터 Long 변환 후 계산한다.
        val rows = line.map { (a, b, c) ->
            longArrayOf(a.toLong(), b.toLong(), c.toLong())
        }
        for (i in 0 until rows.size - 1) {
            for (j in i + 1 until rows.size) {
                val (a, b, e) = rows[i]
                val (c, d, f) = rows[j]
                // 교점 계산식
                val adbc = (a * d) - (b * c)
                val bfed = (b * f) - (e * d)
                val ecaf = (e * c) - (a * f)
                // 평행하거나 좌표가 정수가 아니면 패스
                if (adbc == 0L || bfed % adbc != 0L || ecaf % adbc != 0L) continue
                // 교점 기록
                val x = bfed / adbc
                val y = ecaf / adbc
                set += x to y
                // 좌표의 최대치
                minX = minOf(minX, x)
                maxX = maxOf(maxX, x)
                minY = minOf(minY, y)
                maxY = maxOf(maxY, y)
            }
        }
        // "*" 찍기
        val row = (maxY - minY + 1).toInt()
        val col = (maxX - minX + 1).toInt()
        val arr = Array(row) { CharArray(col) { '.' } }
        for ((x, y) in set) {
            arr[(maxY - y).toInt()][(x - minX).toInt()] = '*'
        }
        // List → Array
        return arr.map { it.joinToString("") }.toTypedArray()
    }
}
