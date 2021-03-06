package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P43163Test {
    val p = P43163()

    @Test
    fun `example 01`() {
        assertThat(p.solution("hit", "cog", arrayOf("hot", "dot", "dog", "lot", "log", "cog")), `is`(4))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution("hit", "cog", arrayOf("hot", "dot", "dog", "lot", "log")), `is`(0))
    }

}
