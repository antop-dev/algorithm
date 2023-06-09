package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/493
class P176962 {
    fun solution(plans: Array<Array<String>>): Array<String> {
        var i = 0
        val answer = Array(plans.size) { "" }
        // 주어진 문제를 구조체로 변경
        val items = plans.map { convert(it) }
        // 우선순위큐 사용
        val pq = PriorityQueue<Plan> { o1, o2 -> o1.start - o2.start }
        for (plan in items) pq += plan
        // 미룬 과제가 들어갈 스택
        val deferred = Stack<Plan>()

        // 시작
        while (pq.isNotEmpty()) {
            var plan = pq.poll() // 현재 과제
            if (pq.isEmpty()) { // 다음 과제가 없으면 종료 처리
                answer[i++] = plan.name
                break
            }

            val next = pq.peek() // 다음 과제와 시간을 비교한다.
            if (plan.playtime <= next.start - plan.start) { // 현재 과제와 다음 과제 사이에 시간이 남거나 딱 맞는다.
                answer[i++] = plan.name // 현재 작업 완료 처리
                var endTime = plan.start + plan.playtime // 현재 과제가 끝난 시간
                // 현재 과제가 끝난 시간 ~ 다음 과제 시작 사이에 미뤄둔 과제를 한다.
                while (next.start - endTime > 0 && deferred.isNotEmpty()) {
                    plan = deferred.pop()
                    if (plan.playtime <= next.start - endTime) {
                        // 미룬 과제를 해서 시간이 남거나 딱 맞는 경우
                        answer[i++] = plan.name
                        endTime += plan.playtime
                    } else {
                        // 미룬 과제를 하는 시간이 모자른 경우
                        plan.playtime -= next.start - endTime
                        endTime = next.start
                        deferred += plan
                    }
                }
            } else { // 시간이 모자란다면 뒤로 미룬다.
                plan.playtime -= next.start - plan.start
                deferred += plan
            }
        }
        // 미뤄놨던 과제 다 꺼내서 한다.
        while (deferred.isNotEmpty()) {
            answer[i++] = deferred.pop().name
        }

        return answer
    }

    private fun convert(plan: Array<String>): Plan {
        val (name, start, playtime) = plan
        val (h, m) = start.split(":")
        return Plan(
                name = name,
                start = (h.toInt() * 60) + m.toInt(),
                playtime = playtime.toInt()
        )
    }

    data class Plan(val name: String, var start: Int, var playtime: Int)
}
