package kr.co.programmers

import kotlin.math.abs

// https://programmers.co.kr/learn/courses/30/lessons/67256
class P67256 {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        val prev = arrayOf(intArrayOf(3, 0), intArrayOf(3, 2)) // 초기 위치
        for (n in numbers) {
            // 키패드 -> 인덱스
            var idx = n - 1
            if (idx == -1) idx = 10
            // 인덱스 -> 2차원 배열
            val p = intArrayOf(idx / 3, idx % 3)
            if (p[1] == 0) { // 왼손
                answer += "L"
                prev[0] = p
            } else if (p[1] == 2) { // 오른손
                answer += "R"
                prev[1] = p
            } else {
                // 왼손으로부터의 거리
                val diffLeft = abs(prev[0][0] - p[0]) + abs(prev[0][1] - p[1])
                // 오른손으로부터의 거리
                val diffRight = abs(prev[1][0] - p[0]) + abs(prev[1][1] - p[1])
                if (diffLeft < diffRight) {
                    answer += "L"
                    prev[0] = p
                } else if (diffLeft > diffRight) {
                    answer += "R"
                    prev[1] = p
                } else {
                    if (hand == "left") {
                        answer += "L"
                        prev[0] = p
                    } else {
                        answer += "R"
                        prev[1] = p
                    }
                }
            }
        }
        return answer
    }
}
