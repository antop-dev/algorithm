package com.leetcode

// https://github.com/antop-dev/algorithm/issues/647
class P3016 {
    fun minimumPushes(word: String): Int {
        // 어떤 문자인지는 중요하지 않음
        // 문자의 개수만 세고 내림차순 정렬
        val counter = word.groupingBy { it }
            .eachCount()
            .values
            .sortedDescending()

        println(word.groupingBy { it }
            .eachCount()
        )

        var ans = 0
        for (i in counter.indices) {
            val times = (i / 8) + 1 // 이 문자를 누르기 위한 횟수
            ans += counter[i] * times // 문자 개수 * 회수
        }
        return ans
    }
}