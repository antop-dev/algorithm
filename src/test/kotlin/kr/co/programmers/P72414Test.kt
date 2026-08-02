package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P72414Test {
    private val sut = P72414()

    @Test
    fun `example 1`() {
        val playTime = "02:03:55"
        val advTime = "00:14:15"
        val logs = arrayOf(
            "01:20:15-01:45:14",
            "00:40:31-01:00:00",
            "00:25:50-00:48:29",
            "01:30:59-01:53:29",
            "01:37:44-02:02:30",
        )
        assertThat(sut.solution(playTime, advTime, logs), `is`("01:30:59"))
    }

    @Test
    fun `example 2`() {
        val playTime = "99:59:59"
        val advTime = "25:00:00"
        val logs = arrayOf(
            "69:59:59-89:59:59",
            "01:00:00-21:00:00",
            "79:59:59-99:59:59",
            "11:00:00-31:00:00",
        )
        assertThat(sut.solution(playTime, advTime, logs), `is`("01:00:00"))
    }

    @Test
    fun `example 3`() {
        val playTime = "50:00:00"
        val advTime = "50:00:00"
        val logs = arrayOf(
            "15:36:51-38:21:49",
            "10:14:18-15:36:51",
            "38:21:49-42:51:45",
        )
        assertThat(sut.solution(playTime, advTime, logs), `is`("00:00:00"))
    }

    @Test
    fun `example 4`() {
        val playTime = "00:00:30"
        val advTime = "00:00:05"
        val logs = arrayOf(
            "00:00:02-00:00:05",
            "00:00:04-00:00:07",
            "00:00:10-00:00:20",
            "00:00:13-00:00:23",
            "00:00:15-00:00:25"
        )
        assertThat(sut.solution(playTime, advTime, logs), `is`("00:00:15"))
    }

    @Test
    fun `example 5`() {
        val playTime = "00:00:30"
        val advTime = "00:00:10"
        val logs = arrayOf(
            "00:00:00-00:00:10",
        )
        assertThat(sut.solution(playTime, advTime, logs), `is`("00:00:00"))
    }
}
