package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P388351Test {
    val sut = P388351()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution(
                schedules = intArrayOf(700, 800, 1100),
                timeLogs = arrayOf(
                    intArrayOf(710, 2359, 1050, 700, 650, 631, 659),
                    intArrayOf(800, 801, 805, 800, 759, 810, 809),
                    intArrayOf(1105, 1001, 1002, 600, 1059, 1001, 1100),
                ),
                startDay = 5
            ),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution(
                schedules = intArrayOf(730, 855, 700, 720),
                timeLogs = arrayOf(
                    intArrayOf(710, 700, 650, 735, 700, 931, 912),
                    intArrayOf(908, 901, 805, 815, 800, 831, 835),
                    intArrayOf(705, 701, 702, 705, 710, 710, 711),
                    intArrayOf(707, 731, 859, 913, 934, 931, 905),
                ),
                startDay = 1
            ),
            `is`(2)
        )
    }
}