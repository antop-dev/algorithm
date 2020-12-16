package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P583Test {
    val p = P583()

    @Test
    fun `example 01`() {
        assertThat(p.minDistance("sea", "eat"), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minDistance("", ""), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minDistance("abc", "abc"), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minDistance("", "a"), `is`(1))
        //   : [a]
    }

    @Test
    fun `example 05`() {
        assertThat(p.minDistance("a", "b"), `is`(2))
        // [a] : [b]
    }

    @Test
    fun `example 06`() {
        assertThat(p.minDistance("sea", "ate"), `is`(4))
    }

    @Test
    fun `example 07`() {
        assertThat(p.minDistance("ate", "sea"), `is`(4))
    }

    @Test
    fun `example 08`() {
        assertThat(p.minDistance("park", "spake"), `is`(3))
    }

    @Test
    fun `example 09`() {
        assertThat(p.minDistance("intention", "execution"), `is`(8))
    }

}
