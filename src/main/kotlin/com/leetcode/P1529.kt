package com.leetcode

// https://leetcode.com/problems/bulb-switcher-iv/
class P1529 {
    fun minFlips(target: String): Int {
        var blub = '0' // current index blub flag
        var count = 0 // count of flips
        for (i in target.indices) {
            if (blub != target[i]) {
                blub = target[i]
                count++
            }
        }
        return count
    }
}
