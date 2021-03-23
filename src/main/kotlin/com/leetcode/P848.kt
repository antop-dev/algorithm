package com.leetcode

// https://leetcode.com/problems/shifting-letters/
class P848 {
    fun shiftingLetters(S: String, shifts: IntArray): String {
        var shift = 0
        var answer = ""
        for (i in shifts.lastIndex downTo 0) {
            shift = (shift + shifts[i]) % 26
            answer = S[i].run {
                // 28번 쉬프트는 결국 2번 쉬프트 하는 것과 같다.
                var c = this + shift
                // 알파벳 범위 a(97) ~ z(122) 를 넘칠 경우
                if (c > 'z') c -= 26
                c
            } + answer
        }
        return answer
    }
}
