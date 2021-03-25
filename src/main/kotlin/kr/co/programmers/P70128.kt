package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/70128
class P70128 {
    fun solution(a: IntArray, b: IntArray): Int {
        var sum = 0
        for (i in a.indices) sum += a[i] * b[i]
        return sum
    }
}
