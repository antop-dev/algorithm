package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/512
class P142085 {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var soldier = n // 남은 병사 수
        var used = k // 남은 무적권 수
        // 이전에 병사를 사용 했던 적의 수 기록하며 큰 수가 앞에 온다.
        // 처음부터 무적권을 사용해야 할 경우에도 일관성있는 코드를 위해서 0을 넣어둔다.
        val pq = PriorityQueue<Int>().apply { this += 0 }
        // 라운드
        var round = 0
        for (i in enemy.indices) {
            val v = enemy[i] // 적 수
            soldier -= v // 적을 막는다.
            pq += -v // 적의 수 기록
            if (soldier < 0 && used > 0) { // 무적권 사용
                soldier += -pq.poll()
                used--
            }
            if (soldier < 0) break
            round++
        }
        return round
    }
}
