package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P258Test {
    val p = P258()

    @Test
    fun `example 01`() {
        assertThat(p.addDigits(38), `is`(2))
    }
    
}
