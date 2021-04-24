package com.leetcode

// https://github.com/antop-dev/algorithm/issues/246
class P451 {
    fun frequencySort(s: String): String {
        // 원래는 문자의 비중과 문자의 순서로 두개의 조건이 쓰여야 하지만
        // groupingBy의 결과로 키가 정렬이 되어버린다.
        return s.groupingBy { it }.eachCount()
            .toList()
            .sortedByDescending { it.second }
            .joinToString("") { (c, n) -> "$c".repeat(n) }
    }
}
