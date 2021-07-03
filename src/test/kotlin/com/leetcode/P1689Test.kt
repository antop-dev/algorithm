package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1689Test {
    val p = P1689()

    @Test
    fun `example 01`() {
        assertThat(p.minPartitions("32"), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minPartitions("82734"), `is`(8))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minPartitions("27346209830709182346"), `is`(9))
    }

}
