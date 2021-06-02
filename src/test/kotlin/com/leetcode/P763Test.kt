package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P763Test {
    val p = P763()

    @Test
    fun `example 01`() {
        assertThat(p.partitionLabels("ababcbacadefegdehijhklij"), `is`(listOf(9, 7, 8)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.partitionLabels("abaccbdeffed"), `is`(listOf(6, 6)))
    }
}
