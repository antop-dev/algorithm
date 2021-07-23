package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P229Test {
    val p = P229()

    @Test
    fun `example 01`() {
        assertThat(p.majorityElement(intArrayOf(3, 2, 3)), `is`(listOf(3)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.majorityElement(intArrayOf(1)), `is`(listOf(1)))
    }

    @Test
    fun `example 03`() {
        assertThat(p.majorityElement(intArrayOf(1, 2)), `is`(listOf(1, 2)))
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.majorityElement(intArrayOf(3, 2, 3, 4, 4, 3, 5, 5, 5, 3, 4, 5)),
            `is`(listOf())
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.majorityElement(intArrayOf(3, 2, 3, 4, 4, 3, 5, 5, 5, 3, 4, 5)),
            `is`(listOf())
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.majorityElement(intArrayOf(1, 2, 3, 4)),
            `is`(listOf())
        )
    }

    @Test
    fun `example 07`() {
        assertThat(
            p.majorityElement(intArrayOf(1, 2, 3, 3, 3, 3, 4, 4, 4, 4)),
            `is`(listOf(3, 4))
        )
    }

    @Test
    fun `example 08`() {
        assertThat(
            p.majorityElement(intArrayOf(2, 2, 1, 3)),
            `is`(listOf(2))
        )
    }

    @Test
    fun `example 09`() {
        assertThat(
            p.majorityElement(intArrayOf(-1, -1, -1)),
            `is`(listOf(-1))
        )
    }

}
