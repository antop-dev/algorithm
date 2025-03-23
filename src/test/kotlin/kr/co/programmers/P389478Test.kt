package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P389478Test {
    val sut = P389478()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(22, 6, 8), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(13, 3, 6), `is`(4))
    }
}
