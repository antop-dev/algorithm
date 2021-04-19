package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/238
class P70129 {

    fun solution(s: String): IntArray {
        val answer: IntArray = intArrayOf(0, 0)
        var ss = s
        while (ss != "1") {
            answer[0]++
            answer[1] += ss.count { it == '0' }
            ss = ss.replace("0", "").length.toString(2)
        }

        return answer
    }

}
