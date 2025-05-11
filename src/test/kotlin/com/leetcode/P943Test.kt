package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P943Test {
    val sut = P943()

    @Test
    fun example() {
        assertThat(sut.beautifulArray(1), `is`(intArrayOf(1)))
        assertThat(sut.beautifulArray(2), `is`(intArrayOf(1, 2)))
        assertThat(sut.beautifulArray(3), `is`(intArrayOf(1, 3, 2)))
        assertThat(sut.beautifulArray(4), `is`(intArrayOf(1, 3, 2, 4)))
        assertThat(sut.beautifulArray(5), `is`(intArrayOf(1, 5, 3, 2, 4)))
        assertThat(sut.beautifulArray(6), `is`(intArrayOf(1, 5, 3, 2, 6, 4)))
        assertThat(sut.beautifulArray(7), `is`(intArrayOf(1, 5, 3, 7, 2, 6, 4)))
        assertThat(sut.beautifulArray(8), `is`(intArrayOf(1, 5, 3, 7, 2, 6, 4, 8)))
        assertThat(sut.beautifulArray(9), `is`(intArrayOf(1, 9, 5, 3, 7, 2, 6, 4, 8)))
        assertThat(sut.beautifulArray(10), `is`(intArrayOf(1, 9, 5, 3, 7, 2, 10, 6, 4, 8)))
        assertThat(sut.beautifulArray(11), `is`(intArrayOf(1, 9, 5, 3, 11, 7, 2, 10, 6, 4, 8)))
        assertThat(sut.beautifulArray(12), `is`(intArrayOf(1, 9, 5, 3, 11, 7, 2, 10, 6, 4, 12, 8)))
        assertThat(
            sut.beautifulArray(20),
            `is`(intArrayOf(1, 17, 9, 5, 13, 3, 19, 11, 7, 15, 2, 18, 10, 6, 14, 4, 20, 12, 8, 16))
        )
    }

}