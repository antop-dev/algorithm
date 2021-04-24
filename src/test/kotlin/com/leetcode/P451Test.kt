package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.isIn
import org.junit.jupiter.api.Test

class P451Test {
    val p = P451()

    @Test
    fun `example 01`() {
        assertThat(p.frequencySort("tree"), `is`("eert"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.frequencySort("cccaaa"), `is`("aaaccc"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.frequencySort("Aabb"), isIn(arrayOf("bbAa", "bbaA")));
    }

}
