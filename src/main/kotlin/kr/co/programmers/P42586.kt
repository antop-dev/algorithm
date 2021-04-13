package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/42586
class P42586 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        var i = 0
        while (i < progresses.size) {
            var count = 0
            for (k in i until progresses.size) {
                progresses[k] += speeds[k]
                if (progresses[k] >= 100 && i == k) {
                    count++
                    i++
                }
            }
            if (count > 0) answer += count
        }
        return answer.toIntArray()
    }
}
