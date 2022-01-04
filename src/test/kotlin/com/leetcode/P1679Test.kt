package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1679Test {
    val p = P1679()

    @Test
    fun `example 01`() {
        assertThat(p.maxOperations(intArrayOf(1, 2, 3, 4), 5), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxOperations(intArrayOf(3, 1, 3, 4, 3), 5), `is`(1))
    }

}
