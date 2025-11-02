package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2327Test {
    val sut = P2327()

    @Test
    fun `example 1`() {
        assertThat(sut.peopleAwareOfSecret(6, 2, 4), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.peopleAwareOfSecret(4, 1, 3), `is`(6))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.peopleAwareOfSecret(1000, 1, 1000), `is`(344211605))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.peopleAwareOfSecret(1000, 2, 1000), `is`(517691607))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.peopleAwareOfSecret(10, 2, 5), `is`(30))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.peopleAwareOfSecret(289, 7, 23), `is`(790409951))
    }
}