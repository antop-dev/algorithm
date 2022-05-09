package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12953Test {
    val p = P12953()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(2, 6, 8, 14)), `is`(168))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(1, 2, 3)), `is`(6))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(intArrayOf(1, 3, 6)), `is`(6))
    }

}
