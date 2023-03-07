package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/470
class P161989 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        if (section.size == 1 || n == m) {
            return 1
        }
        var count = 0
        var from = 0
        var to = 1
        while (to < section.size) {
            val len = section[to] - section[from] + 1
            if (m < len) { // k까지 칠하지 못한다
                count++
                from = to
            } else if (m <= len) { // k를 포함해서 칠할 수 있다
                count++
                from = to + 1
                to++
            }
            to++
        }
        if (to == section.size) { // 처리되지 않은 한칸
            count++
        }
        return count
    }
}
