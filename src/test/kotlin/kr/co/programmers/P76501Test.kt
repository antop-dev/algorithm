package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P76501Test {
    val p = P76501()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)), `is`(9))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true)), `is`(0))
    }

}
