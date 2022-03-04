package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42839Test {
    val p = P42839()

    @Test
    fun `example 01`() {
        assertThat(p.solution("17"), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("011"), `is`(2))
    }

}
