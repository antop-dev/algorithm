package com.leetcode

// https://github.com/antop-dev/algorithm/issues/332
class P447 {
    fun numberOfBoomerangs(points: Array<IntArray>): Int {
        var answer = 0
        for (i in points.indices) {
            val map = mutableMapOf<Int, Int>()
            for (j in points.indices) {
                if (i == j) continue
                val distance = distance(points[i], points[j])
                map[distance] = (map[distance] ?: 0) + 1
            }
            // combinations of boomerang tuple
            for (count in map.values) {
                answer += count * (count - 1)
            }
        }
        return answer
    }

    private fun distance(p1: IntArray, p2: IntArray): Int {
        // 두 포인트간에 거리 구하기
        // 원래는 제곱과 루트(sqrt)를 계산해야 하지만
        // 모든 결과가 동일한 연산을 하므로 생략 가능하다
        val dx = p1[0] - p2[0]
        val dy = p1[1] - p2[1]
        return (dx * dx) + (dy * dy)
    }

}
