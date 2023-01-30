package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/458
class P132265 {
    fun solution(topping: IntArray): Int {
        val left = IntArray(10001)
        val right = IntArray(10001)
        val counter = intArrayOf(0, 0)
        // 동생이 모든 토핑을 다 가지고 시작
        for (t in topping) {
            right[t]++
            if (right[t] == 1) {
                counter[1]++
            }
        }
        var answer = 0
        for (t in topping) {
            // 철수쪽 토핑 추가
            left[t]++
            if (left[t] == 1) { // 1개가 되었을 때 카운트++
                counter[0]++
            }
            // 동생쪽 토핑 제거
            right[t]--
            if (right[t] == 0) { // 0개가 되었을 때 카운트--
                counter[1]--
            }
            if (counter[0] == counter[1]) {
                answer++
            }
        }
        return answer
    }
}
