package kr.co.programmers

import kotlin.math.pow

// https://programmers.co.kr/learn/courses/30/lessons/68935
class P68935 {
    fun solution(n: Int): Int {
        val radix = 3
        // 10진수 -> 3진수
        var m = n
        var s = ""
        while (m > 0) {
            s = "${m % radix}$s"
            m /= radix
        }
        // 반전
        s.reversed()
        s = s.toCharArray().run {
            for (i in 0 until this.size / 2) {
                val j = this.lastIndex - i
                val t = this[i]
                this[i] = this[j]
                this[j] = t
            }
            this.joinToString("")
        }
        // 3진수 -> 10진수로
        var answer = 0
        for (i in s.lastIndex downTo 0) {
            val x = s[i].toInt() - 48
            answer += x * radix.toDouble().pow(s.lastIndex - i).toInt()
        }

        return answer
    }
}
