package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P12914Test {
    val sut = P12914()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(4), `is`(5L))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(3), `is`(3L))
    }

}
