package com.leetcode

// https://github.com/antop-dev/algorithm/issues/702
class P1894 {
    fun chalkReplacer(chalk: IntArray, k: Int): Int {
        val prefixSum = prefixSum(chalk)
        val x = k % prefixSum.last() // 반복 스킵
        return binarySearch(prefixSum, x)
    }

    // 이진탐색
    private fun binarySearch(prefixSum: LongArray, k: Long): Int {
        var left = 0
        var right = prefixSum.lastIndex
        while (left < right) {
            val mid = (left + right) / 2
            if (prefixSum[mid] <= k) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return right
    }

    // 누적합
    private fun prefixSum(chalk: IntArray): LongArray {
        val prefixSum = LongArray(chalk.size)
        prefixSum[0] = chalk[0].toLong()

        for (i in 1 until chalk.size) {
            prefixSum[i] = prefixSum[i - 1] + chalk[i]
        }
        return prefixSum
    }
}