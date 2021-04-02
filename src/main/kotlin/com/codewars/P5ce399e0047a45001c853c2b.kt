package com.codewars

// https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/kotlin
class P5ce399e0047a45001c853c2b {
    fun sumParts(ls: IntArray): IntArray {
        val answer = Array(ls.size + 1) { 0 }
        for (i in ls.indices) {
            answer[0] += ls[i]
        }
        for (i in 1 until ls.size) {
            answer[i] = answer[i - 1] - ls[i - 1]
        }
        return answer.toIntArray()
    }
}
