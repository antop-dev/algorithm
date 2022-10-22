package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P118666Test {
    val p = P118666()

    @Test
    fun `example 01`() {
        assertThat(p.solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5)), `is`("TCMA"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3)), `is`("RCJA"))
    }

}
