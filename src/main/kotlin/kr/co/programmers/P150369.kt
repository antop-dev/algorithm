package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/491
class P150369 {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        val d = Stack<Int>()
        val p = Stack<Int>()
        var move = 0L // 총 이동거리

        for (i in 0 until n) {
            if (deliveries[i] > 0) d.push(i)
            if (pickups[i] > 0) p.push(i)
        }

        while (d.isNotEmpty() || p.isNotEmpty()) {
            // 배달과 수거중 가장 먼 위치 찾기
            val i = maxOf(peek(d), peek(p))
            // 왕복 거리 계산
            move += (i + 1) * 2
            // 배달과 수거 계산하기
            calculate(d, deliveries, cap)
            calculate(p, pickups, cap)
        }

        return move
    }

    private fun calculate(stack: Stack<Int>, arr: IntArray, cap: Int) {
        var sum = 0
        while (stack.isNotEmpty() && sum < cap) {
            val i = stack.pop()
            val v = arr[i]
            // 배달(수거)할 양이 최대치(cap)보다 클 경우 최대한 차에 실는다.
            // 수거해야할 양이 6이고 차에 여유공간이 3일경우 3이라도 실어서 간다.
            // 다음에 같은 위치에 와서 남은 3을 수거해간다.
            if (sum + v > cap) {
                arr[i] = sum + v - cap
                stack.push(i)
            }
            sum += v
        }
    }

    // 스택이 비어 있으면 -1 처리
    private fun peek(stack: Stack<Int>) = if (stack.isNotEmpty()) stack.peek() else -1

}
