package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1861Test {
    val sut = P1861()

    @Test
    fun `example 1`() {
        val boxGrid = arrayOf(
            charArrayOf('#', '.', '#')
        )
        assertThat(
            sut.rotateTheBox(boxGrid),
            `is`(
                arrayOf(
                    charArrayOf('.'),
                    charArrayOf('#'),
                    charArrayOf('#'),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        val boxGrid = arrayOf(
            charArrayOf('#', '.', '*', '.'),
            charArrayOf('#', '#', '*', '.'),
        )
        assertThat(
            sut.rotateTheBox(boxGrid),
            `is`(
                arrayOf(
                    charArrayOf('#', '.'),
                    charArrayOf('#', '#'),
                    charArrayOf('*', '*'),
                    charArrayOf('.', '.'),
                )
            )
        )
    }

    @Test
    fun `example 3`() {
        val boxGrid = arrayOf(
            charArrayOf('#', '#', '*', '.', '*', '.'),
            charArrayOf('#', '#', '#', '*', '.', '.'),
            charArrayOf('#', '#', '#', '.', '#', '.'),
        )
        assertThat(
            sut.rotateTheBox(boxGrid),
            `is`(
                arrayOf(
                    charArrayOf('.', '#', '#'),
                    charArrayOf('.', '#', '#'),
                    charArrayOf('#', '#', '*'),
                    charArrayOf('#', '*', '.'),
                    charArrayOf('#', '.', '*'),
                    charArrayOf('#', '.', '.'),
                )
            )
        )
    }
}