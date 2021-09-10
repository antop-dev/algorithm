package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1954Test {
    val p = P1954()

    @Test
    fun `example 01`() {
        assertThat(p.minimumPerimeter(1), `is`(8L))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minimumPerimeter(13), `is`(16L))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minimumPerimeter(1_000_000_000), `is`(5040L))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minimumPerimeter(159_803_320_880_218), `is`(273480L))
    }

    @Test
    fun `example 05`() {
        assertThat(p.minimumPerimeter(60), `is`(16L))
    }

    @Test
    fun `example 06`() {
        assertThat(p.minimumPerimeter(168), `is`(24L))
    }

    @Test
    fun `example 07`() {
        assertThat(p.minimumPerimeter(462_332_582_464_270), `is`(389688L))
    }

    @Test
    fun `example 08`() {
        assertThat(p.minimumPerimeter(692_631_832_592_697), `is`(445896L))
    }

    @Test
    fun `example 09`() {
        assertThat(p.minimumPerimeter(929_231_262_624_585), `is`(491784L))
    }

}
