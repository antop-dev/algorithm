package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P68935Test {
    val p = P68935()

    @Test
    fun `example 01`() {
        assertThat(p.solution(45), `is`(7))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(125), `is`(229))
    }

}
