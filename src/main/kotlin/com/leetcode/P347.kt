package com.leetcode

// https://github.com/antop-dev/algorithm/issues/295
class P347 {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        return nums.toList()
            // 숫자별 카운팅
            .groupingBy { it }.eachCount()
            // 카운트가 높은 순으로 정렬
            .entries.sortedByDescending { it.value }
            // k 개 만큼 가져옴
            .take(k)
            // 숫자만 추출
            .map { it.key }
            // array 로 변경
            .toIntArray()
    }
}
