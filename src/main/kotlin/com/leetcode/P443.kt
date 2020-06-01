package com.leetcode

// https://leetcode.com/problems/string-compression/
class P443 {
    fun compress(chars: CharArray): Int {
        var i = 1
        var j = 0
        var count = 1
        while (i <= chars.size) {
            if (i == chars.size || chars[i - 1] != chars[i]) {
                chars[j++] = chars[i - 1]
                if (count > 1) "$count".forEach { chars[j++] = it }
                count = 1
            } else {
                count++
            }
            i++
        }
        return j
    }
}
