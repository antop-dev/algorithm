package com.leetcode

// https://github.com/antop-dev/algorithm/issues/323
class P1954 {
    fun minimumPerimeter(neededApples: Long): Long {
        var apples = 0L
        var L = 0L // 길이
        var edge = 0L // 모서리 값
        var acc = 0L // 총 누적된 값
        var p = 0L // 마지막 누적 값
        while (apples < neededApples) {
            L++
            edge += 2
            // 누적 값 계산
            acc -= L - 1
            for (x in (p + 1)..edge) acc += x
            p = edge

            apples += acc * 8 // 8번 반복
            apples -= L * 4 // L은 4번 반복
            apples -= edge * 4 // 모서리는 4번 반복
        }

        return (L * 2) * 4
    }
}
