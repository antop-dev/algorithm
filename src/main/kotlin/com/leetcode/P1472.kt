package com.leetcode

// https://github.com/antop-dev/algorithm/issues/282
class P1472(homepage: String) {
    private val list = mutableListOf(homepage)
    private var p = 0

    fun visit(url: String) {
        repeat(list.lastIndex - p) {
            list.removeAt(list.lastIndex)
        }
        list += url
        p++
    }

    fun back(steps: Int): String {
        p = maxOf(0, p - steps)
        return list[p]
    }

    fun forward(steps: Int): String {
        p = minOf(p + steps, list.lastIndex)
        return list[p]
    }
}
