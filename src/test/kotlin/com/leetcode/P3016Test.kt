package com.leetcode

import org.hamcrest.MatcherAssert.*
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3016Test {
    val sut = P3016()

    @Test
    fun `example 1`() {
        assertThat(sut.minimumPushes("abcde"), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minimumPushes("xyzxyzxyzxyz"), `is`(12))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minimumPushes("aabbccddeeffgghhiiiiii"), `is`(24))
    }
}