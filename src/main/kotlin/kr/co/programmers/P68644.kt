package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/68644
class P68644 {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableSetOf<Int>()

        for (i in 0 until numbers.lastIndex) {
            for (j in i + 1 until numbers.size) {
                answer += numbers[i] + numbers[j]
            }
        }

        return answer.sorted().toIntArray()
    }
}
