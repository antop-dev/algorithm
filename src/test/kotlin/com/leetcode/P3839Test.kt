package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3839Test {
    val sut = P3839()

    @Test
    fun `example 1`() {
        val words = arrayOf("apple", "apply", "banana", "bandit")
        val k = 2
        assertThat(sut.numberOfPrefixConnectedGroups(words, k), `is`(2))
    }

    @Test
    fun `example 2`() {
        val words = arrayOf("car", "cat", "cartoon")
        val k = 3
        assertThat(sut.numberOfPrefixConnectedGroups(words, k), `is`(1))
    }

    @Test
    fun `example 3`() {
        val words = arrayOf("bat", "dog", "dog", "doggy", "bat")
        val k = 3
        assertThat(sut.numberOfPrefixConnectedGroups(words, k), `is`(2))
    }
}
