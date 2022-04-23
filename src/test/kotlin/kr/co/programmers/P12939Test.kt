package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12939Test {
    val p = P12939()

    @Test
    fun `example 01`() {
        assertThat(p.solution("1 2 3 4"), `is`("1 4"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("-1 -2 -3 -4"), `is`("-4 -1"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("1 -1"), `is`("-1 1"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution("1000 123 12345"), `is`("123 12345"))
    }

}