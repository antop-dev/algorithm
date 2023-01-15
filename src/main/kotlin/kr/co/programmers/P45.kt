package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/456
class P45 {
    fun jump(nums: IntArray): Int {
        val dp = IntArray(nums.size) { nums.size }
        dp[dp.lastIndex] = 0

        for (i in nums.lastIndex - 1 downTo 0) {
            val to = minOf(i + nums[i], nums.lastIndex)
            for (j in i + 1..to) {
                dp[i] = minOf(dp[i], dp[j] + 1)
            }
        }

        println(dp.contentToString())

        return dp[0]
    }
}
