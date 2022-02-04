package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42842Test {
    val p = P42842()

    @Test
    fun `example 01`() {
        assertThat(p.solution(10, 2), `is`(intArrayOf(4, 3)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(8, 1), `is`(intArrayOf(3, 3)))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(24, 24), `is`(intArrayOf(8, 6)))
    }

}
