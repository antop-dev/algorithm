package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P846Test {
    val sut = P846()

    @Test
    fun `example 1`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(1, 2, 3, 6, 2, 3, 4, 7, 8), 3),
            `is`(true)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(1, 2, 3, 4, 5), 4),
            `is`(false)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(1, 3, 5, 7, 9, 10), 2),
            `is`(false)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(1, 2, 6, 7, 9, 10), 2),
            `is`(true)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(2, 1), 2),
            `is`(true)
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(8, 10, 12), 3),
            `is`(false)
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(1, 1, 2, 2, 3, 3), 2),
            `is`(false)
        )
    }

    @Test
    fun `example 8`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(5, 6, 2, 1), 2),
            `is`(true)
        )
    }

    @Test
    fun `example 9`() {
        assertThat(
            sut.isNStraightHand(intArrayOf(3, 4, 7, 4, 6, 3, 6, 5, 2, 8), 2),
            `is`(false)
        )
    }
}
