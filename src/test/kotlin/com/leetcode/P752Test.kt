package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P752Test {
    val sut = P752()

    @Test
    fun `example 1`() {
        assertThat(
            sut.openLock(arrayOf("0201", "0101", "0102", "1212", "2002"), "0202"),
            `is`(6)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.openLock(arrayOf("8888"), "0009"),
            `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.openLock(arrayOf("8887","8889","8878","8898","8788","8988","7888","9888"), "8888"),
            `is`(-1)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.openLock(arrayOf("0000"), "8888"),
            `is`(-1)
        )
    }

}
