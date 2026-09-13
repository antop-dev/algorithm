package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P761Test {
    private val sut = P761()

    @Test
    fun `example 01`() {
        assertThat(sut.makeLargestSpecial("11011000"), `is`("11100100"))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.makeLargestSpecial("10"), `is`("10"))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.makeLargestSpecial("10101100"), `is`("11001010"))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.makeLargestSpecial("1010111000"), `is`("1110001010"))
    }

    @Test
    fun `example 05`() {
        assertThat(sut.makeLargestSpecial("101010"), `is`("101010"))
    }

    @Test
    fun `example 06`() {
        assertThat(sut.makeLargestSpecial("101100"), `is`("110010"))
    }

    @Test
    fun `example 07`() {
        assertThat(sut.makeLargestSpecial("110010"), `is`("110010"))
    }

    @Test
    fun `example 08`() {
        assertThat(sut.makeLargestSpecial("11001100"), `is`("11001100"))
    }

    @Test
    fun `example 09`() {
        assertThat(sut.makeLargestSpecial("10110100"), `is`("11010010"))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.makeLargestSpecial("111000"), `is`("111000"))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.makeLargestSpecial("110100"), `is`("110100"))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.makeLargestSpecial("10101100"), `is`("11001010"))
    }

    @Test
    fun `example 13`() {
        assertThat(sut.makeLargestSpecial("1101001100"), `is`("1101001100"))
    }

    @Test
    fun `example 14`() {
        assertThat(sut.makeLargestSpecial("1100101100"), `is`("1100110010"))
    }

    @Test
    fun `example 15`() {
        assertThat(sut.makeLargestSpecial("10111000"), `is`("11100010"))
    }

    @Test
    fun `example 16`() {
        assertThat(sut.makeLargestSpecial("1110001010"), `is`("1110001010"))
    }

    @Test
    fun `example 17`() {
        assertThat(sut.makeLargestSpecial("1010111000"), `is`("1110001010"))
    }

    @Test
    fun `example 18`() {
        assertThat(sut.makeLargestSpecial("11110000"), `is`("11110000"))
    }

    @Test
    fun `example 19`() {
        assertThat(sut.makeLargestSpecial("10101010"), `is`("10101010"))
    }

    @Test
    fun `example 20`() {
        assertThat(sut.makeLargestSpecial("1100110010"), `is`("1100110010"))
    }

    @Test
    fun `example 21`() {
        assertThat(sut.makeLargestSpecial("1101011000"), `is`("1110010100"))
    }

    @Test
    fun `example 22`() {
        assertThat(sut.makeLargestSpecial("1011001010"), `is`("1100101010"))
    }

    @Test
    fun `example 23`() {
        assertThat(sut.makeLargestSpecial("1011101000"), `is`("1110100010"))
    }

    @Test
    fun `example 24`() {
        assertThat(sut.makeLargestSpecial("1110100010"), `is`("1110100010"))
    }

    @Test
    fun `example 25`() {
        assertThat(sut.makeLargestSpecial("111100001100"), `is`("111100001100"))
    }

    @Test
    fun `example 26`() {
        assertThat(sut.makeLargestSpecial("110011110000"), `is`("111100001100"))
    }

    @Test
    fun `example 27`() {
        assertThat(sut.makeLargestSpecial("111111000000"), `is`("111111000000"))
    }

    @Test
    fun `example 28`() {
        val s = "10".repeat(25)
        assertThat(sut.makeLargestSpecial(s), `is`(s))
    }

    @Test
    fun `example 29`() {
        val s = "1".repeat(25) + "0".repeat(25)
        assertThat(sut.makeLargestSpecial(s), `is`(s))
    }

    @Test
    fun `example 30`() {
        val s = "1".repeat(24) + "0".repeat(24) + "10"
        assertThat(sut.makeLargestSpecial(s), `is`(s))
    }
}
