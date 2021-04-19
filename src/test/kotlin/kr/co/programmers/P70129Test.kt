package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P70129Test {
    val p = P70129()

    @Test
    fun `example 01`() {
        assertThat(p.solution("110010101001"), `is`(intArrayOf(3, 8)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("01110"), `is`(intArrayOf(3, 3)))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("1111111"), `is`(intArrayOf(4, 1)))
    }

}
