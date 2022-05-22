package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P87946Test {
    val p = P87946()

    @Test
    fun `example 01`() {
        val k = 80
        val dungeons = arrayOf(intArrayOf(80, 20), intArrayOf(50, 40), intArrayOf(30, 10))
        assertThat(p.solution(k, dungeons), `is`(3))
    }

    @Test
    fun `example 02`() {
        val k = 70
        val dungeons = arrayOf(intArrayOf(80, 20), intArrayOf(50, 40), intArrayOf(30, 10))
        assertThat(p.solution(k, dungeons), `is`(2))
    }

    @Test
    fun `example 03`() {
        val k = 10
        val dungeons = arrayOf(intArrayOf(80, 20))
        assertThat(p.solution(k, dungeons), `is`(0))
    }

    @Test
    fun `example 04`() {
        val k = 10
        val dungeons = arrayOf(intArrayOf(10, 10))
        assertThat(p.solution(k, dungeons), `is`(1))
    }

    @Test
    fun `example 05`() {
        val k = 10
        val dungeons = arrayOf(intArrayOf(20, 5), intArrayOf(5, 5), intArrayOf(10, 5))
        assertThat(p.solution(k, dungeons), `is`(2))
    }

}
