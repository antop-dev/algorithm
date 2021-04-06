package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12977Test {
    val p = P12977()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(1, 2, 3, 4)), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(1, 2, 7, 6, 4)), `is`(4))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(intArrayOf(1, 6, 4)), `is`(1))
    }

}
