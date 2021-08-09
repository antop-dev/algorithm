package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P81301Test {
    val p = P81301()

    @Test
    fun `example 01`() {
        assertThat(p.solution("one4seveneight"), `is`(1478))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("23four5six7"), `is`(234567))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution("2three45sixseven"), `is`(234567))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution("123"), `is`(123))
    }

}
