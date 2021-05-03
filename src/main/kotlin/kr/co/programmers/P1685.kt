package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/255
class P1685 {
    fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)
        // [0]: i 이전 값들의 합
        // [1]: i 이후 값들의 합
        val sum = intArrayOf(0, nums.sum())
        for (i in nums.indices) {
            val num = nums[i]
            sum[1] -= num
            result[i] = (num * i) - (num * (n - i - 1)) - sum[0] + sum[1]
            sum[0] += num
        }
        return result
    }
}
