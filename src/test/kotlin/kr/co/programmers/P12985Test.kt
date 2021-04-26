package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12985Test {
    val p = P12985()

    @Test
    fun `example 01`() {
        assertThat(p.solution(8, 4, 7), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(8, 1, 2), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(8, 2, 3), `is`(2))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution(8, 7, 4), `is`(3))
    }

}
