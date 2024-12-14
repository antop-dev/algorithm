package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/608
class P42747 {
    fun solution(citations: IntArray): Int {
        citations.sortDescending()
        for (i in citations.indices) {
            if (i + 1 > citations[i]) {
                return i
            }
        }
        return citations.size
    }
}
