package kr.co.programmers

import kotlin.math.pow

// https://programmers.co.kr/learn/courses/30/lessons/84512
class P84512 {
    fun solution(word: String): Int {
        var answer = 0
        val maxLength = 5.0
        // 경우의 수 총합
        val max = (1..maxLength.toInt()).fold(0) { acc, i ->
            acc + 5.0.pow(i).toInt()
        }
        //  ['A', 'E', 'I', 'O', 'U'] 순서 [0, 1, 2, 3, 4]
        for (i in 1..word.length) {
            answer += when (word[i - 1]) {
                'A' -> 1
                'E' -> (max / maxLength.pow(i.toDouble()) * 1 + 1).toInt()
                'I' -> (max / maxLength.pow(i.toDouble()) * 2 + 1).toInt()
                'O' -> (max / maxLength.pow(i.toDouble()) * 3 + 1).toInt()
                'U' -> (max / maxLength.pow(i.toDouble()) * 4 + 1).toInt()
                else -> 0
            }
        }
        return answer
    }
}
