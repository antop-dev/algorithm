package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1002Test {
    val p = P1002()

    @Test
    fun `example 01`() {
        assertThat(
            p.commonChars(arrayOf("bella", "label", "roller")),
            `is`(listOf("e", "l", "l"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.commonChars(arrayOf("cool", "lock", "cook")),
            `is`(listOf("c", "o"))
        )
    }
}
