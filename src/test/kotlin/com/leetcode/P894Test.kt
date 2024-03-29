package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.jupiter.api.Test

class P894Test {
    val sut = P894()

    @Test
    fun `example 1`() {
        val trees = sut.allPossibleFBT(7)
        assertThat(trees, hasSize(5))
    }

    @Test
    fun `example 2`() {
        val trees = sut.allPossibleFBT(3)
        assertThat(trees, hasSize(1))
        assertThat(trees[0], notNullValue())
        assertThat(trees[0]?.left, notNullValue())
        assertThat(trees[0]?.left?.left, nullValue())
        assertThat(trees[0]?.left?.right, nullValue())
        assertThat(trees[0]?.right, notNullValue())
        assertThat(trees[0]?.right?.left, nullValue())
        assertThat(trees[0]?.right?.right, nullValue())
    }

    @Test
    fun `example 3`() {
        val trees = sut.allPossibleFBT(1)
        assertThat(trees, hasSize(1))
        assertThat(trees[0], notNullValue())
        assertThat(trees[0]?.left, nullValue())
        assertThat(trees[0]?.right, nullValue())
    }

}
