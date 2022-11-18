package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2375Test {
    val sut = P2375()

    @Test
    fun `example 01`() {
        assertThat(sut.smallestNumber("IIIDIDDD"), `is`("123549876"))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.smallestNumber("DDD"), `is`("4321"))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.smallestNumber("IDIDIDID"), `is`("132547698"))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.smallestNumber("DIDIDIDI"), `is`("214365879"))
    }

}
