package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1685Test {
    val p = P1685()

    @Test
    fun `example 01`() {
        assertThat(
            p.getSumAbsoluteDifferences(intArrayOf(2, 3, 5)),
            `is`(intArrayOf(4, 3, 5))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.getSumAbsoluteDifferences(intArrayOf(1, 4, 6, 8, 10)),
            `is`(intArrayOf(24, 15, 13, 15, 21))
        )
    }
}
