package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/340
class P43238 {
    fun solution(n: Int, times: IntArray): Long {
        val N = n.toLong()
        // 최소 시간
        var left = times.min()!!.toLong()
        // 최대 시간
        var right = n.toLong() * times.max()!!
        // 답
        var answer = right
        // Binary Search
        while (left <= right) {
            // 중간 시간
            val mid = (right + left) / 2
            // 주어진 시간(mid)내에 처리할 수 있는 인원 수
            val capacity = times.fold(0L) { acc, time -> acc + (mid / time) }
            // N을 성립하는 최소값을 구해야한다.
            if (N <= capacity) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return answer
    }
}
