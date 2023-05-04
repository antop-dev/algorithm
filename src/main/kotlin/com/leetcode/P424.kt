package com.leetcode

// https://github.com/antop-dev/algorithm/issues/485
class P424 {
    fun characterReplacement(s: String, k: Int): Int {
        var left = 0
        var maxLen = 0 // 가장 긴 길이(답)
        var largest = 0 // 가장 많이 차지하는 문자 수
        val arr = IntArray(26) // 처리된 문자의 개수
        for (right in s.indices) {
            val ch = s[right]
            arr[ch - 'A']++
            largest = maxOf(largest, arr[ch - 'A']) // 가장 많은 문자의 개수
            val other = (right - left + 1) - largest // 가장 많은 문자수를 제외한 문자의 수
            if (other > k) {
                arr[s[left] - 'A']--
                left++
            }
            maxLen = maxOf(maxLen, right - left + 1) // 최대 길이 기록
        }
        return maxLen
    }

}
