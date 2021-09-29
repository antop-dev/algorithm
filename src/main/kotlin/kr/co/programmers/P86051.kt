package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/333
class P86051 {
    fun solution(numbers: IntArray): Int {
        var total = 0
        for (n in 1..9) total += n
        for (n in numbers) total -= n
        return total
    }
}
