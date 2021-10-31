package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P64062Test {
    val p = P64062()

    @Test
    fun `example 01`() {
        assertThat(p.solution(intArrayOf(2, 4, 5, 3, 2, 1, 4, 2, 5, 1), 3), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(intArrayOf(2, 4, 5, 3, 2, 1, 4, 2, 5, 1), 2), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.solution(intArrayOf(2, 4, 8, 3, 2, 1, 4, 9, 1), 5), `is`(8))
    }

    @Test
    fun `example 04`() {
        assertThat(p.solution(intArrayOf(1, 1, 1, 1, 1, 1, 1), 3), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(p.solution(intArrayOf(11, 11, 11, 11, 11, 11, 11), 3), `is`(11))
    }

}
