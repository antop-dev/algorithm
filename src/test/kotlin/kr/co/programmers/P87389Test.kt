package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P87389Test {
    val p = P87389()

    @Test
    fun `example 01`() {
        assertThat(p.solution(10), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(12), `is`(11))
    }

}
