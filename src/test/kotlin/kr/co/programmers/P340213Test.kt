package kr.co.programmers

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P340213Test {
    val sut = P340213()

    @Test
    fun `example 1`() {
        assertThat(
            sut.solution("34:33", "13:00", "00:55", "02:55", arrayOf("next", "prev")),
            `is`("13:00")
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.solution("10:55", "00:05", "00:15", "06:55", arrayOf("prev", "next", "next")),
            `is`("06:55")
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.solution("07:22", "04:05", "00:15", "04:07", arrayOf("next")),
            `is`("04:17")
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.solution("10:00", "00:03", "00:00", "00:05", arrayOf("prev", "next")),
            `is`("00:15")
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.solution("07:22", "07:05", "00:15", "04:07", arrayOf("next", "next")),
            `is`("07:22")
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.solution("07:22", "00:05", "00:15", "04:07", arrayOf("next", "next")),
            `is`("04:17")
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.solution("07:22", "00:15", "03:15", "04:07", arrayOf("prev", "prev")),
            `is`("00:00")
        )
    }

    @Test
    fun `example 8`() {
        assertThat(
            sut.solution("34:33", "33:55", "00:01", "34:20", arrayOf("next", "next", "prev", "prev", "next")),
            `is`("34:30")
        )
    }

    @Test
    fun `example 9`() {
        assertThat(
            sut.solution("59:59", "59:45", "00:00", "01:00", arrayOf("next")),
            `is`("59:55")
        )
    }

    @Test
    fun `example 10`() {
        assertThat(
            sut.solution("59:59", "59:45", "00:00", "01:00", arrayOf("next")),
            `is`("59:55")
        )
    }

    @Test
    fun `example 11`() {
        assertThat(
            sut.solution("30:00", "01:05", "01:00", "01:30", arrayOf("prev")),
            `is`("01:30")
        )
    }

    @Test
    fun `example 12`() {
        assertThat(
            sut.solution("10:55", "00:16", "00:15", "00:17", arrayOf("prev")),
            `is`("00:07")
        )
    }

    @Test
    fun `example 13`() {
        assertThat(
            sut.solution("10:00", "00:03", "00:00", "00:05", arrayOf("prev", "next")),
            `is`("00:15")
        )
    }

    @Test
    fun `example 14`() {
        assertThat(
            sut.solution("10:00", "09:03", "00:00", "00:05", arrayOf("prev")),
            `is`("08:53")
        )
    }

    @Test
    fun `example 15`() {
        assertThat(
            sut.solution("10:00", "00:10", "00:00", "00:05", arrayOf("prev")),
            `is`("00:05")
        )
    }

    @Test
    fun `example 16`() {
        assertThat(
            sut.solution("30:00", "01:55", "01:00", "01:30", arrayOf("next")),
            `is`("02:05")
        )
    }

}
