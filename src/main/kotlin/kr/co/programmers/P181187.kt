package kr.co.programmers

import kotlin.math.pow
import kotlin.math.sqrt

// https://github.com/antop-dev/algorithm/issues/502
class P181187 {
    fun solution(r1: Int, r2: Int): Long {
        // y가 0인 점의 개수
        var count = 0L + (r2 - r1 + 1) * 4
        // x 좌표만 루프
        for (x in 1 until r2) {
            val minY = if (x < r1) y(x, r1).toCeilInt() else 1
            val maxY = y(x, r2).toFloorInt()
            count += (maxY - minY + 1) * 4
        }
        return count
    }

    // 피타고라스 정리를 이용하여 y값을 구한다.
    private fun y(x: Int, r: Int) = sqrt(r.pow(2) - x.pow(2))
}

// Int.제곱근
private fun Int.pow(n: Int) = this.toDouble().pow(n)

// Double -> 올림 Int
private fun Double.toCeilInt(): Int {
    var v = this.toInt()
    if (this - v > 0) v++
    return v
}

// Double -> 내림 Int
private fun Double.toFloorInt() = this.toInt()
