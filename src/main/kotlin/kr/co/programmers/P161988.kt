package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/531
class P161988 {
    fun solution(sequence: IntArray): Long {
        var ans = 0L
        var p = -1L
        var sum1 = 0L
        var sum2 = 0L
        for (v in sequence) {
            // -1, 1, -1, 1, ...
            if (sum1 + v * p >= 0) {
                sum1 += v * p
                if (sum1 > ans) ans = sum1
            } else {
                sum1 = 0
            }
            // 1, -1, 1, -1, ...
            p *= -1
            if (sum2 + v * p >= 0) {
                sum2 += v * p
                if (sum2 > ans) ans = sum2
            } else {
                sum2 = 0
            }
        }
        return ans
    }

}
