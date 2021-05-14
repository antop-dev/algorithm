package com.leetcode

import java.lang.StringBuilder

// https://github.com/antop-dev/algorithm/issues/263
class P1249 {
    fun minRemoveToMakeValid(s: String): String {
        val list = s.toCharArray().toMutableList()

        var open = 0
        var close = 0
        for (i in list.indices) {
            if (list[i] == '(') {
                open++
            } else if (list[i] == ')') {
                if (close >= open) list[i] = '_'
                else close++
            }
        }

        open = 0
        close = 0
        for (i in list.indices.reversed()) {
            if (list[i] == ')') {
                close++
            } else if (list[i] == '(') {
                if (open >= close) list[i] = '_'
                else open++
            }
        }

        return list.filter { it != '_' }.joinToString("")
    }

}
