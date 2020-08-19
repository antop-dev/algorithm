package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P357Test {
    val p = P357()

    @Test
    fun `example 00`() {
        assertThat(p.countNumbersWithUniqueDigits(0), `is`(1));
    }

    @Test
    fun `example 01`() {
        assertThat(p.countNumbersWithUniqueDigits(1), `is`(10));
    }

    @Test
    fun `example 02`() {
        assertThat(p.countNumbersWithUniqueDigits(2), `is`(91));
    }

    @Test
    fun `example 03`() {
        assertThat(p.countNumbersWithUniqueDigits(3), `is`(739));
    }

    @Test
    fun `example 04`() {
        assertThat(p.countNumbersWithUniqueDigits(4), `is`(5275));
    }

    @Test
    fun `example 05`() {
        assertThat(p.countNumbersWithUniqueDigits(5), `is`(32491));
    }

    @Test
    fun `example 06`() {
        assertThat(p.countNumbersWithUniqueDigits(6), `is`(168571));
    }

    @Test
    fun `example 07`() {
        assertThat(p.countNumbersWithUniqueDigits(7), `is`(712891));
    }

    @Test
    fun `example 08`() {
        assertThat(p.countNumbersWithUniqueDigits(8), `is`(2345851));
    }
}
