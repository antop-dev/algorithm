package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P70128Test {
    val p = P70128()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2)), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(-1, 0, 1), intArrayOf(1, 0, -1)), `is`(-2))
    }

}
