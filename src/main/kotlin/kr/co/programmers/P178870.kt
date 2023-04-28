package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/483
class P178870 {
    fun solution(sequence: IntArray, k: Int): IntArray {
        val pq = PriorityQueue<IntArray>(compareBy { it[1] - it[0] })
        val n = sequence.size
        var l = 0
        var r = 0
        var sum = sequence[0]
        while (r in l until n) {
            if (sum == k) {
                pq += intArrayOf(l, r)
            }
            if (r == n - 1) {
                sum -= sequence[l++]
            } else {
                sum += if (sum < k) sequence[++r] else -sequence[l++]
            }
        }
        return pq.poll()
    }
}
