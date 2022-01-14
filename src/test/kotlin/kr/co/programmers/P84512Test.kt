package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P84512Test {
    val p = P84512()

    @Test
    fun `example 01`() {
        assertThat(p.solution("AAAAE"), `is`(6))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("AAAE"), `is`(10))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("I"), `is`(1563))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution("EIO"), `is`(1189))
    }

}
