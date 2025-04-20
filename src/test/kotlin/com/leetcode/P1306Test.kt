package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1306Test {
    val sut = P1306()

    @Test
    fun `example 1`() {
        assertThat(sut.canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 5), `is`(true))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 0), `is`(true))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.canReach(intArrayOf(3, 0, 2, 1, 2), 2), `is`(false))
    }

}