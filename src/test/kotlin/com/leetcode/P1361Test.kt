package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1361Test {
    val p = P1361()

    @Test
    fun `example 1`() {
        assertThat(
                p.validateBinaryTreeNodes(4, intArrayOf(1, -1, 3, -1), intArrayOf(2, -1, -1, -1)),
                `is`(true)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
                p.validateBinaryTreeNodes(4, intArrayOf(1, -1, 3, -1), intArrayOf(2, 3, -1, -1)),
                `is`(false)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
                p.validateBinaryTreeNodes(2, intArrayOf(1, 0), intArrayOf(-1, -1)),
                `is`(false)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
                p.validateBinaryTreeNodes(6, intArrayOf(1, -1, -1, 4, -1, -1), intArrayOf(2, -1, -1, 5, -1, -1)),
                `is`(false)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
                p.validateBinaryTreeNodes(4, intArrayOf(1, 2, 0, -1), intArrayOf(-1, -1, -1, -1)),
                `is`(false)
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
                p.validateBinaryTreeNodes(2, intArrayOf(-1, 0), intArrayOf(-1, -1)),
                `is`(true)
        )
    }

}