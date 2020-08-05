package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1446Test {
    val p = P1446()

    @Test
    fun `example 01`() {
        assertThat(p.maxPower("leetcode"), `is`(2));
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxPower("abbcccddddeeeeedcba"), `is`(5));
    }

    @Test
    fun `example 03`() {
        assertThat(p.maxPower("triplepillooooow"), `is`(5));
    }

    @Test
    fun `example 04`() {
        assertThat(p.maxPower("hooraaaaaaaaaaay"), `is`(11));
    }

    @Test
    fun `example 05`() {
        assertThat(p.maxPower("tourist"), `is`(1));
    }

    @Test
    fun `example 06`() {
        assertThat(p.maxPower("j"), `is`(1));
    }

    @Test
    fun `example 07`() {
        assertThat(p.maxPower("cc"), `is`(2));
    }
}
