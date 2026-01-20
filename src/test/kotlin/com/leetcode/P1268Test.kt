package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1268Test {
    val sut = P1268()

    @Test
    fun `example 1`() {
        assertThat(
            sut.suggestedProducts(
                products = arrayOf("mobile", "mouse", "moneypot", "monitor", "mousepad"),
                searchWord = "mouse",
            ),
            `is`(
                listOf(
                    listOf("mobile", "moneypot", "monitor"),
                    listOf("mobile", "moneypot", "monitor"),
                    listOf("mouse", "mousepad"),
                    listOf("mouse", "mousepad"),
                    listOf("mouse", "mousepad"),
                ),
            ),
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.suggestedProducts(
                products = arrayOf("havana"),
                searchWord = "havana",
            ),
            `is`(
                listOf(
                    listOf("havana"),
                    listOf("havana"),
                    listOf("havana"),
                    listOf("havana"),
                    listOf("havana"),
                    listOf("havana"),
                ),
            ),
        )
    }
}
