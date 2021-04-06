package kr.co.programmers

import kotlin.math.sqrt

// https://programmers.co.kr/learn/courses/30/lessons/12977
class P12977 {
    fun solution(nums: IntArray): Int {
        // 에라토스테네스의 체
        val max = (951..1000).sum()
        val prime = Array(max + 1) { true }
        for (i in 2 until sqrt(max.toDouble()).toInt()) {
            if (prime[i]) {
                var j = i
                while (j * i < max) {
                    prime[i * j] = false
                    j++
                }
            }
        }

        var answer = 0
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (prime[nums[i] + nums[j] + nums[k]]) {
                        answer++
                    }
                }
            }
        }

        return answer
    }
}
