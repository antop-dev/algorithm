package kr.co.programmers

import java.util.LinkedList
import java.util.Queue

// https://github.com/antop-dev/algorithm/issues/684
class P340211 {
    fun solution(points: Array<IntArray>, routes: Array<IntArray>): Int {
        // 로봇 인스턴스 생성
        val robots = routes.map { route ->
            Robot(
                routes = route.map { i ->
                    Point(points[i - 1][0], points[i - 1][1])
                }.toCollection(LinkedList())
            )
        }
        // 시뮬레이션
        var ans = 0
        while (robots.any { it.moved }) {
            // 충돌 체크
            val crash = robots.filter { it.moved }
                .groupingBy { it.point }
                .eachCount()
                .filter { (_, count) -> count > 1 }
                .size
            ans += crash
            // 이동
            robots.forEach { it.move() }
        }
        return ans
    }

    class Robot(
        private var routes: Queue<Point>
    ) {
        /** 로봇의 현재 위치 */
        var point: Point
            private set

        /** 로봇의 목적지 */
        var destination: Point
            private set

        init {
            point = routes.poll() // 첫번째는 출발지
            destination = routes.poll() // 두번째부터는 목적지
        }

        /** 이동 했는지 여부 */
        var moved = true
            private set

        /** 목적지로 이동 */
        fun move() {
            moved = true
            point = when {
                point.r < destination.r -> Point(point.r + 1, point.c) // 아래
                point.r > destination.r -> Point(point.r - 1, point.c) // 위
                point.c < destination.c -> Point(point.r, point.c + 1) // 오른쪽
                point.c > destination.c -> Point(point.r, point.c - 1) // 왼쪽

                else -> {
                    moved = false
                    point
                }
            }
            // 목적지로 이동했으면 다음 목적지로 교체
            if (point == destination && routes.isNotEmpty()) {
                destination = routes.poll()
            }
        }
    }

    /** 위치 클래스 */
    data class Point(
        val r: Int,
        val c: Int,
    )
}