package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12952Test {
    val sut = P12952()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(4), `is`(2))
    }
}
