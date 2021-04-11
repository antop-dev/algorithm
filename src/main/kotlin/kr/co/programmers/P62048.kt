package kr.co.programmers

// https://programmers.co.kr/learn/courses/30/lessons/62048
class P62048 {
    fun solution(w: Int, h: Int): Long {
        return (w * h).toLong() - (w + h - gcd(w, h))
    }

    // greatest common factor
    private fun gcd(x: Int, y: Int): Int {
        var a = maxOf(x, y)
        var b = minOf(x, y)
        while (b > 0) {
            val r = a % b
            a = b
            b = r % b
        }
        return a
    }

}
