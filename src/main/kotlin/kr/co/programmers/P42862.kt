package kr.co.programmers

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
class P42862 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        // 학생번호에 해당하는 채육복 소지 수
        // [0] [n+2] 인덱스는 사용하지 않음
        val items = IntArray(n + 2) { 1 }
        items[0] = 0
        items[items.lastIndex] = 0
        // 체육복을 도난당한 학생
        for (i in lost) items[i]--
        // 여별의 체육복을 가져온 학생
        for (i in reserve) items[i]++
        // 체육복 나눠주기
        for (i in 1 until items.lastIndex) {
            if (items[i] > 0) continue
            if (items[i - 1] > 1) {
                items[i - 1]--
                items[i]++
            } else if (items[i + 1] > 1) {
                items[i + 1]--
                items[i]++
            }
        }
        return items.count { it > 0 }
    }
}
