package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P62Test {
    val p = P62()

    @Test
    fun `example 1`() {
        assertThat(p.uniquePaths(3, 2), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(p.uniquePaths(7, 3), `is`(28))
    }

}