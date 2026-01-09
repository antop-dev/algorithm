package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2337Test {
    val sut = P2337()

    @Test
    fun `example 1`() {
        assertThat(
            sut.canChange("_L__R__R_", "L______RR"),
            `is`(true)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.canChange("R_L_", "__LR"),
            `is`(false)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.canChange("_R", "R_"),
            `is`(false)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.canChange("R__L", "_RL_"),
            `is`(true)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.canChange("_LL__R__R_", "L___L___RR"),
            `is`(false)
        )
    }
}