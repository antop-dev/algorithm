package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/315
class P77884 {
    fun solution(left: Int, right: Int): Int {
        return (left..right).fold(0) { acc, n ->
            acc + if (count(n) % 2 == 0) n else -n
        }
    }

    private fun count(n: Int): Int {
        if (n <= 1) return n
        var count = 2 // 1과 n 자신
        for (i in 2..n / 2) {
            if (n % i == 0) count++
        }
        return count
    }
}
