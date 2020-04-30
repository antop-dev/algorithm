package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P67Test {
    val p = P67()

    @Test
    fun `example 1`() {
        assertThat(p.addBinary("11", "1"), `is`("100"))
    }

    @Test
    fun `example 2`() {
        assertThat(p.addBinary("1010", "1011"), `is`("10101"))
    }

    @Test
    fun `example 3`() {
        assertThat(p.addBinary("0", "0"), `is`("0"))
    }

    @Test
    fun `example 4`() {
        assertThat(
                p.addBinary(
                        "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
                ), `is`("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"))
    }
}