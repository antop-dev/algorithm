package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P6Test {
    val p = P6()

    @Test
    fun `example 01`() {
        assertThat(p.convert(s = "PAYPALISHIRING", numRows = 3), `is`("PAHNAPLSIIGYIR"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.convert(s = "PAYPALISHIRING", numRows = 4), `is`("PINALSIGYAHRPI"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.convert(s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", numRows = 4), `is`("AGMSYBFHLNRTXZCEIKOQUWDJPV"))
    }

}
