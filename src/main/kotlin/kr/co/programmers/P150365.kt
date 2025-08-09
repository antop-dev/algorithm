package kr.co.programmers

import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/674
class P150365 {
    fun solution(n: Int, m: Int, x: Int, y: Int, r: Int, c: Int, k: Int): String {
        val path = StringBuilder() // 이동 경로
        var (cy, cx) = x to y // 현재 위치
        var dist = dist(cx, cy, r, c) // 탈출 취이촤의 거리
        // 거리가 k보다 멀거나 남은 이동 회수가 홀수면 안된다.
        if (k < dist || (k - dist) % 2 != 0) {
            return "impossible"
        }
        // 이동 함수
        val up: () -> Unit = { path.append("u"); cy-- }
        val right: () -> Unit = { path.append("r"); cx++ }
        val down: () -> Unit = { path.append("d"); cy++ }
        val left: () -> Unit = { path.append("l"); cx-- }
        // 1. 갈수 있는 한 (1,n)으로 이동한다
        while (k - path.length > dist && !(cy == n && cx == 1)) {
            when {
                cy < n -> down()
                cx > 1 -> left()
            }
            dist = dist(cx, cy, c, r)
        }
        // 2. 목적지까지 가는 거리보다 이동 회수가 더 많이 남아 있다면 rl 이동을 소비
        if (cy == n && cx == 1) {
            repeat((k - dist - path.length) / 2) {
                path.append("rl")
            }
        }
        // 3. 탈출 지점으로 이동
        while (cx != c || cy != r) {
            when {
                cy < r -> down()
                cx > c -> left()
                cx < c -> right()
                else -> up()
            }
        }
        return path.toString()
    }

    // 현재 위치(sx,sy)와 탈출 위치(ex,ey) 사이의 거리를 계산(맨해튼 거리)
    private fun dist(sx: Int, sy: Int, ex: Int, ey: Int): Int {
        return abs(sx - ex) + abs(sy - ey)
    }
}