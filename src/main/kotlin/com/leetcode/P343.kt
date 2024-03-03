package com.leetcode

// https://github.com/antop-dev/algorithm/issues/278
class P343 {
    fun integerBreak(n: Int): Int {
        if (n <= 3) return n - 1
        var share = n / 3 // 몫
        var remain = n % 3
        when (remain) {
            1 -> { // 나머지가 1이면 4(1 + 3)로 만든다.
                remain += 3
                share--
            }

            0 -> remain = 1
        }
        // ( 3 ^ share ) * remain
        var ans = 1
        repeat(share) { ans *= 3 }
        ans *= remain
        return ans
    }
}
