package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P43238Test {
    val p = P43238()

    @Test
    fun `example 01`() {
        assertThat(p.solution(6, intArrayOf(7, 10)), `is`(28L))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(3, intArrayOf(1, 1, 1)), `is`(1L))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(3, intArrayOf(1, 2, 3)), `is`(2L))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution(3, intArrayOf(1000000000, 1000000000, 1000000000)), `is`(1000000000L))
    }


}
