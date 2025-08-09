package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P150365Test {
    val sut = P150365()

    @Test
    fun `example 1`() {
        assertThat(sut.solution(3, 4, 2, 3, 3, 1, 5), `is`("dllrl"))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.solution(2, 2, 1, 1, 2, 2, 2), `is`("dr"))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.solution(3, 3, 1, 2, 3, 3, 4), `is`("impossible"))
    }
}