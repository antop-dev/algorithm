package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P96Test {
    val p = P96()

    @Test
    fun `example 01`() {
        assertThat(p.numTrees(1), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.numTrees(2), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.numTrees(3), `is`(5))
    }

    @Test
    fun `example 04`() {
        assertThat(p.numTrees(4), `is`(14))
    }

    @Test
    fun `example 05`() {
        assertThat(p.numTrees(5), `is`(42))
    }

    @Test
    fun `example 06`() {
        assertThat(p.numTrees(6), `is`(132))
    }

    @Test
    fun `example 07`() {
        assertThat(p.numTrees(7), `is`(429))
    }

    @Test
    fun `example 08`() {
        assertThat(p.numTrees(8), `is`(1430))
    }

}
