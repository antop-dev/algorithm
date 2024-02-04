package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/537
class P136797 {
    // 한 자판에서 다른 자판으로 가는 가중치
    private val costs = arrayOf(
        intArrayOf(1, 7, 6, 7, 5, 4, 5, 3, 2, 3), // 자판 0
        intArrayOf(7, 1, 2, 4, 2, 3, 5, 4, 5, 6),
        intArrayOf(6, 2, 1, 2, 3, 2, 3, 5, 4, 5),
        intArrayOf(7, 4, 2, 1, 5, 3, 2, 6, 5, 4),
        intArrayOf(5, 2, 3, 5, 1, 2, 4, 2, 3, 5),
        intArrayOf(4, 3, 2, 3, 2, 1, 2, 3, 2, 3),
        intArrayOf(5, 5, 3, 2, 4, 2, 1, 5, 3, 2),
        intArrayOf(3, 4, 5, 6, 2, 3, 5, 1, 2, 4),
        intArrayOf(2, 5, 4, 5, 3, 2, 3, 2, 1, 2),
        intArrayOf(3, 6, 5, 4, 5, 3, 2, 4, 2, 1) // 자판 9
    )

    fun solution(numbers: String): Int {
        // 메모제이션
        val memo = Array(numbers.length) {
            Array(10) { IntArray(10) { -1 } }
        }
        // 왼손은 4, 오른손은 6 자판에서 시작
        return f(numbers, 0, memo, 4, 6)
    }

    /**
     * @param numbers 눌러야 할 숫자 문자열
     * @param i 다음으로 눌러야하는 번호 인덱스
     * @param memo 메모제이션
     * @param left 현재 왼손의 자판 번호
     * @param right 현재 오른손의 자판 번호
     */
    private fun f(numbers: String, i: Int, memo: Array<Array<IntArray>>, left: Int, right: Int): Int {
        if (i == numbers.length) return 0
        // 이미 전에 계산했던 이력이 있다면 더 깊이 내려가지 않고
        // 이전 이력 값을 사용한다.
        if (memo[i][left][right] != -1) {
            return memo[i][left][right]
        }
        // 눌러야 하는 숫자 자판 번호
        val num = numbers[i] - '0'

        var min = Int.MAX_VALUE
        if (num != right) { // 왼손이 움직일 수 있는 경우 (오른손이 가야할 자판에 있다면 손이 겹치게 된다.)
            // (왼손이 num으로 이동) + (다음 자판~마지막 자판까지 누른 최소 가중치)
            val cost = costs[left][num] + f(numbers, i + 1, memo, num, right)
            min = minOf(min, cost)
        }
        if (num != left) { // 오른손이 움직일 수 있는 경우
            // (오른손이 num으로 이동) + (다음 자판~마지막 자판까지 누른 최소 가중치)
            val cost = costs[right][num] + f(numbers, i + 1, memo, left, num)
            min = minOf(min, cost)
        }

        memo[i][left][right] = min // 메모제이션
        return min
    }
}
