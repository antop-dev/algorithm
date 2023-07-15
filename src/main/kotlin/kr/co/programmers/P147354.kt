package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/498
class P147354 {
    fun solution(data: Array<IntArray>, col: Int, rowBegin: Int, rowEnd: Int): Int {
        // (2)
        data.sortWith(compareBy({ it[col - 1] }, { -it[0] }))
        var hash = 0
        for (i in rowBegin..rowEnd) {
            // (3)
            var s = 0
            for (n in data[i - 1]) {
                s += n % i
            }
            // (4)
            hash = hash.xor(s)
        }
        return hash
    }
}
