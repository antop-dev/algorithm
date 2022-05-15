package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/12953
class P12953 {
    fun solution(arr: IntArray): Int {
        if (arr.size == 1) return arr[0]
        // 가장 큰 수를 찾는다.
        var max = Int.MIN_VALUE
        for (n in arr) {
            if (n > max) max = n
        }
        // 가장 큰 수를 최소공배수(Least Common Multiple)로 시작
        var lcm = max

        loop@ while (true) {
            for (n in arr) {
                if (lcm % n > 0) {
                    // 하나라도 나누어 떨어지지 않으면 증가 시키고 다시 시작
                    lcm += max
                    continue@loop
                }
            }
            // 모든 수로 나누어 떨어진다면 최소공배수
            break
        }

        return lcm
    }
}
