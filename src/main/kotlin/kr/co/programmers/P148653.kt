package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/469
class P148653 {
    fun solution(storey: Int): Int {
        var count = 0
        var v = storey
        while (v > 0) {
            val m = v % 10
            v /= 10
            if (m > 5) {
                count += (10 - m)
                v++
            } else {
                count += m
                if (m == 5 && v % 10 >= 5) {
                    v++
                }
            }
        }
        return count
    }
}
