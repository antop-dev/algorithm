package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/258
class P76501 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        // return absolutes.zip(signs.toTypedArray()).sumBy { (n, v) -> if (v) n else -n }
        var sum = 0
        for (i in absolutes.indices) {
            sum += if (signs[i]) absolutes[i] else -absolutes[i]
        }
        return sum

    }
}
