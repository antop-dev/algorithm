package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/489
class P155651 {
    fun solution(bookTime: Array<Array<String>>): Int {
        // 입(퇴)실 시간으로 정렬
        // 시간이 같다면 퇴실 시간이 먼저다.
        // first : 시간
        // second : 1(입실), 0(퇴실)
        val pq = PriorityQueue<Pair<Int, Int>> { a, b ->
            if (a.first == b.first) a.second - b.second else a.first - b.first
        }

        for (book in bookTime) {
            val (entrance, leave) = book
            pq += convert(entrance) to 1 // 입실
            pq += convert(leave, 10) to 0 // 퇴실 + 10분
        }

        var answer = 0
        var now = 0
        while (pq.isNotEmpty()) {
            val time = pq.poll()
            now += if (time.second == 1) 1 else -1
            answer = maxOf(answer, now)
        }
        return answer
    }

    // 시간 문자열을 숫자로 변경
    private fun convert(s: String, plus: Int = 0): Int {
        val split = s.split(":")
        var hour = split[0].toInt()
        var minute = split[1].toInt() + plus
        // 분이 넘쳤을 때 시간으로 넘긴다.
        if (minute >= 60) {
            hour++
            minute -= 60
        }
        return (hour * 60) + minute
    }

}
