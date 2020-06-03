package com.leetcode

import kotlin.math.sqrt

// https://leetcode.com/problems/design-hashmap/
class P706 {
    // data class
    data class Node(val key: Int, var value: Int)

    private val limit = 1_000_000.0
    private val array = Array((limit / sqrt(limit)).toInt()) { mutableListOf<Node>() }

    fun put(key: Int, value: Int) {
        with(array[index(key)]) {
            this.find { it.key == key }?.apply { this.value = value }
                ?: this.add(Node(key, value))
        }
    }

    fun get(key: Int): Int {
        return array[index(key)].find { it.key == key }?.value ?: -1
    }

    fun remove(key: Int) {
        array[index(key)].removeIf { it.key == key }
    }

    private fun index(key: Int) = key % array.size

}
