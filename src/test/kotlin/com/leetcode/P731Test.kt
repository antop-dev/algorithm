package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P731Test {

    @Test
    fun `example 01`() {
        val cal = P731()
        assertThat(cal.book(10, 20), `is`(true))
        assertThat(cal.book(50, 60), `is`(true))
        assertThat(cal.book(10, 40), `is`(true))
        assertThat(cal.book(5, 15), `is`(false))
        assertThat(cal.book(5, 10), `is`(true))
        assertThat(cal.book(25, 55), `is`(true))
    }

    @Test
    fun `example 02`() {
        val cal = P731()
        assertThat(cal.book(10, 20), `is`(true))
        assertThat(cal.book(10, 20), `is`(true))
        assertThat(cal.book(10, 20), `is`(false))
    }

    @Test
    fun `example 03`() {
        val cal = P731()
        assertThat(cal.book(10, 20), `is`(true))
        assertThat(cal.book(10, 20), `is`(true))
        assertThat(cal.book(15, 30), `is`(false))
    }

    @Test
    fun `example 04`() {
        val cal = P731()
        assertThat(cal.book(10, 20), `is`(true))
        assertThat(cal.book(30, 40), `is`(true))
        assertThat(cal.book(15, 35), `is`(true))
    }

    @Test
    fun `example 05`() {
        val cal = P731()
        assertThat(cal.book(24, 40), `is`(true))
        assertThat(cal.book(43, 50), `is`(true))
        assertThat(cal.book(27, 43), `is`(true))
        assertThat(cal.book(5, 21), `is`(true))
        assertThat(cal.book(30, 40), `is`(false))
        assertThat(cal.book(14, 29), `is`(false))
        assertThat(cal.book(3, 19), `is`(true))
        assertThat(cal.book(3, 14), `is`(false))
        assertThat(cal.book(25, 39), `is`(false))
        assertThat(cal.book(6, 19), `is`(false))
    }

    @Test
    fun `example 06`() {
        val cal = P731()
        assertThat(cal.book(24, 40), `is`(true))
        assertThat(cal.book(27, 43), `is`(true))
        assertThat(cal.book(30, 40), `is`(false))
    }

    @Test
    fun `example 07`() {
        val cal = P731()
        assertThat(cal.book(28, 46), `is`(true))
        assertThat(cal.book(9, 21), `is`(true))
        assertThat(cal.book(21, 39), `is`(true))
        assertThat(cal.book(37, 48), `is`(false))
        assertThat(cal.book(38, 50), `is`(false))
        assertThat(cal.book(22, 39), `is`(false))
        assertThat(cal.book(45, 50), `is`(true))
        assertThat(cal.book(1, 12), `is`(true))
        assertThat(cal.book(40, 50), `is`(false))
        assertThat(cal.book(31, 44), `is`(false))
    }

    @Test
    fun `example 08`() {
        val cal = P731()
        assertThat(cal.book(28, 46), `is`(true))
        assertThat(cal.book(45, 50), `is`(true))
        assertThat(cal.book(40, 50), `is`(false))
    }

}
