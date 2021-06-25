package com.leetcode

// https://leetcode.com/problems/bulb-switcher-iv/
class P1529 {
    fun minFlips(target: String): Int {
        var c = if (target[0] == '1') 1 else 0
        for (i in 1 until target.length) {
            if (target[i - 1] != target[i]) c++
        }
        return c
    }
}
