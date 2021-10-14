package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P42895Test {
    val p = P42895()

    @Test
    fun `example 01`() {
        assertThat(p.solution(5, 12), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(2, 11), `is`(3))
    }

    @Test
    fun `example 03`() {
        // 8 * 8 - 88 / 8
        assertThat(p.solution(8, 53), `is`(5))
    }

}
