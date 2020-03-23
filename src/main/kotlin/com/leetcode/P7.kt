package com.leetcode

/**
 * https://leetcode.com/problems/reverse-integer/
 */
class P7 {
    fun reverse(x: Int): Int {
        var n = x
        val minus = n < 0 // 음수인지 체크
        if (minus) n *= -1 // 음수인경우 양수로 일단 변환

        val list = mutableListOf<Int>()
        while (n > 0) { // 한자리씩 리스트에 담음
            list.add(n % 10)
            n /= 10
        }

        var answer: Long = 0
        for (i in list.indices) { // 리버스
            answer += list[i] * Math.pow(10.0, (list.size - 1 - i).toDouble()).toLong()
        }

        if (minus) answer *= -1 // 입력이 음수였다면 음수로 만듬
        // -2^31 ~ 2^31-1 체크
        val pow = Math.pow(2.0, 31.0).toLong()
        if (answer >= pow || answer < pow * -1) return 0

        return answer.toInt()
    }

}