package com.leetcode

// https://github.com/antop-dev/algorithm/issues/710
class P918 {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var total = 0
        // 최대합
        var curMax = 0
        var maxSum = nums[0]
        // 최소합
        var curMin = 0
        var minSum = nums[0]
        // 계산
        for (num in nums) {
            curMax = maxOf(curMax + num, num)
            maxSum = maxOf(maxSum, curMax)
            curMin = minOf(curMin + num, num)
            minSum = minOf(minSum, curMin)
            total += num
        }
        // maxSum이 음수라면, 모든 요소가 음수라는 의미
        return if (maxSum > 0) {
            // 양수가 하나라도 있다면, 일반적인 최대합과 원형 최대합 중 더 큰 것을 선택
            maxOf(maxSum, total - minSum)
        } else {
            // 모든 요소가 음수라면, maxSum 자체가 배열 내의 최대값이므로 그대로 반환
            // 만약 여기서 total - minSum을 해버리면 0이 반환되어 잘못된 결과가 나옴
            maxSum
        }
    }
}
