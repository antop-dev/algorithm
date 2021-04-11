package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P62048Test {
    val p = P62048()

    @Test
    fun solution() {
        assertThat(p.solution(8, 12), `is`(80L))
    }

}
