package com.leetcode

// https://github.com/antop-dev/algorithm/issues/539
class P2336 {
    // 각 수의 사용 여부
    private val used = BooleanArray(1001)
    private var i = 1

    fun popSmallest(): Int {
        for (n in i until used.size) {
            if (!used[n]) {
                used[n] = true
                return n
            }
        }
        return -1
    }

    fun addBack(num: Int) {
        used[num] = false
        if (num < i) i = num
    }
}
