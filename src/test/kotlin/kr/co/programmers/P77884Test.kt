package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P77884Test {
    val p = P77884()

    @Test
    fun `example 01`() {
        assertThat(p.solution(13, 17), `is`(43))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(24, 27), `is`(52))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(1, 2), `is`(1))
    }

}
