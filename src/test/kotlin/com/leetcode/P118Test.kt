package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/pascals-triangle/
internal class P118Test {
    val p = P118()

    @Test
    fun `example`() {
        val expected = listOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2, 1),
                listOf(1, 3, 3, 1),
                listOf(1, 4, 6, 4, 1)
        )

        assertThat(p.generate(5), `is`(expected));
    }
}
