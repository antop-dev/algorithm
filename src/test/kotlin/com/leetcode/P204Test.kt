package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P204Test {
    val sut = P204()

    @Test
    fun `example 1`() {
        assertThat(sut.countPrimes(10), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.countPrimes(0), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.countPrimes(1), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.countPrimes(100), `is`(25))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.countPrimes(200), `is`(46))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.countPrimes(300), `is`(62))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.countPrimes(5000000), `is`(348513))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.countPrimes(2), `is`(0))
    }

}
