package kr.co.programmers

import java.util.LinkedList

// https://github.com/antop-dev/algorithm/issues/668
class P389479 {
    fun solution(players: IntArray, m: Int, k: Int): Int {
        var ans = 0 // 증설된 서버 수
        val queue = LinkedList<Int>() // 증설한 서버의 증설 시간이 들어간다
        for (time in players.indices) {
            val p = players[time]
            // k 시간이 지난 서버 반납
            while (queue.isNotEmpty() && time - queue.peek() >= k) {
                queue.poll()
            }
            // 서버 증설
            val n = (p / m) - queue.size
            if (n > 0) {
                repeat(n) { queue += time }
                ans += n
            }
        }
        return ans
    }
}