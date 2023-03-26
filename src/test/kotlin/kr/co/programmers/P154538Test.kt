package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P154538Test {
    val p = P154538()

    @Test
    fun `example 1`() {
        assertThat(p.solution(10, 40, 5), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(p.solution(10, 40, 30), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(p.solution(2, 5, 4), `is`(-1))
    }

    @Test
    fun `example 4`() {
        assertThat(p.solution(1, 1_000_000, 1), `is`(19))
    }

    @Test
    fun `example 5`() {
        assertThat(p.solution(10, 25, 5), `is`(2))
    }

}
