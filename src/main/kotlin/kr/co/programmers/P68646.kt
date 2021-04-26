package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/244
class P68646 {
    fun solution(a: IntArray): Int {
        var answer = 1
        var l = 0
        var r = a.lastIndex
        // [0] = left min
        // [1] = right min
        val min = intArrayOf(a[l], a[r])

        while (l < r) {
            if (min[0] > min[1]) {
                l++
                if (a[l] < min[0]) {
                    answer++
                    min[0] = a[l]
                }
            } else { // min[0] < min[1]
                r--
                if (a[r] < min[1]) {
                    answer++
                    min[1] = a[r]
                }
            }
        }

        return answer
    }
}
