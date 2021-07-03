package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P959Test {
    val p = P959()

    @Test
    fun `example 01`() {
        assertThat(p.regionsBySlashes(arrayOf(" /", "/ ")), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.regionsBySlashes(arrayOf(" /", "  ")), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.regionsBySlashes(arrayOf("\\/", "/\\")), `is`(4))
    }

    @Test
    fun `example 04`() {
        assertThat(p.regionsBySlashes(arrayOf("/\\", "\\/")), `is`(5))
    }

    @Test
    fun `example 05`() {
        assertThat(p.regionsBySlashes(arrayOf("//", "/ ")), `is`(3))
    }

    @Test
    fun `example 06`() {
        assertThat(p.regionsBySlashes(arrayOf(" /\\", " \\/ ", "\\  ")), `is`(4))
    }


}
