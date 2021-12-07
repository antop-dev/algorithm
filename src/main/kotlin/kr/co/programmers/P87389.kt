package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/357
class P87389 {
    fun solution(n: Int): Int {
        for (i in 1 until n - 1) {
            if (n % i == 1) {
                return i
            }
        }
        return n - 1
    }
}
