package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/62048
class P62048 {

    fun solution(w: Int, h: Int): Long {
        return (w.toLong() * h.toLong()) - (w + h - gcd(w, h))
    }

    // greatest common factor
    private fun gcd(n1: Int, n2: Int): Int {
        return if (n2 != 0) gcd(n2, n1 % n2) else n1
    }

}
