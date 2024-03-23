package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12945Test {
    val sut = P12945()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(3), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(5), `is`(5))
    }

}
