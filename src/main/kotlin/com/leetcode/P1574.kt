package com.leetcode

// https://github.com/antop-dev/algorithm/issues/708
class P1574 {
    fun findLengthOfShortestSubarray(arr: IntArray): Int {
        val n = arr.size
        // 왼쪽부터 정렬된 마지막 지점을 찾는다.
        var left = 0
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++
        }
        // 오른쪽부터 정렬된 시작 지점을 찾는다.
        var right = n - 1
        while (right - 1 >= 0 && arr[right - 1] <= arr[right]) {
            right--
        }
        // 왼쪽 정렬 지점을 제외한 오른쪽 전부 제거
        // 오른쪽 정렬 지점을 제외한 왼쪽 전부 제거
        // 중 적게 제거하는 쪽을 남긴다.
        var ans = minOf(n - left - 1, right)
        // 이미 정렬된 경우
        if (ans == 0) {
            return 0
        }
        // 가운데 연속된 부분을 제거
        var i = 0
        var j = right
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                ans = minOf(ans, j - i - 1)
                i++
            } else {
                j++
            }
        }
        return ans
    }
}