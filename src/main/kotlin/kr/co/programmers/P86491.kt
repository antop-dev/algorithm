package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/358
class P86491 {
    fun solution(sizes: Array<IntArray>): Int {
        val v = intArrayOf(0, 0)
        for (s in sizes) {
            if (s[0] < s[1]) {
                val tmp = s[0]
                s[0] = s[1]
                s[1] = tmp
            }
            if (s[0] > v[0]) v[0] = s[0]
            if (s[1] > v[1]) v[1] = s[1]
        }
        return v[0] * v[1]
    }
}
