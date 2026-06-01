package com.leetcode

// https://github.com/antop-dev/algorithm/issues/752
class P3896 {
    companion object {
        // 1만보다 큰 가까운 소수는 1만 3이다
        const val MAX = 100_003
    }

    fun minOperations(nums: IntArray): Int {
        val sieve = sieveOfEratosthenes()
        var ans = 0
        for (i in nums.indices) {
            val num = nums[i]
            val next = when {
                i % 2 == 0 -> findNum(sieve, num, true) // 짝수는 소수
                else -> findNum(sieve, num, false) // 홀수는 합성수
            }
            ans += next - num
        }
        return ans
    }

    /**
     * [num] 포함 큰 수 중에 가장 가까운 소수 또는 합성수 찾기
     *
     * @param isPrime true이면 소수, false이면 합성수
     */
    private fun findNum(sieve: BooleanArray, num: Int, isPrime: Boolean): Int {
        for (n in num..MAX) {
            if (sieve[n] == isPrime) {
                return n
            }
        }
        return num
    }

    /** 에라토스테네스의 체 만들기 */
    private fun sieveOfEratosthenes(): BooleanArray {
        val sieve = BooleanArray(MAX + 1) { true }
        sieve[1] = false

        var i = 2
        while (i * i <= MAX) {
            if (sieve[i]) {
                var j = i * i
                while (j <= MAX) {
                    sieve[j] = false
                    j += i
                }
            }
            i++
        }
        return sieve
    }
}
