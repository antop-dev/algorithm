package com.leetcode

// https://leetcode.com/problems/destination-city/
class P1436 {
    fun destCity(paths: List<List<String>>): String {
        val destinations = paths.map { it[1] }.toMutableList()
        paths.map { it[0] }.forEach { destinations.remove(it) }
        return destinations.first()
    }
}
