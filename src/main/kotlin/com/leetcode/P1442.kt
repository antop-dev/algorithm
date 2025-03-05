package com.leetcode

// https://github.com/antop-dev/algorithm/issues/631
class P1442 {
    fun countTriplets(arr: IntArray): Int {
        val n = arr.size
        var ans = 0
        for (i in 0 until n) {
            var a = arr[i]
            for (j in i + 1 until n) {
                if (i < j - 1) {
                    a = a xor arr[j - 1]
                }
                var b = arr[j]
                for (k in j until n) {
                    if (j < k) {
                        b = b xor arr[k]
                    }
                    if (a == b) {
                        ans++
                    }
                }
            }
        }
        return ans
    }
}
