package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P621Test {
    val sut = P621()

    @Test
    fun `example 1`() {
        assertThat(
            sut.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2),
            `is`(8)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.leastInterval(charArrayOf('A', 'C', 'A', 'B', 'D', 'B'), 1),
            `is`(6)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 3),
            `is`(10)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.leastInterval(charArrayOf('B', 'C', 'D', 'A', 'A', 'A', 'A', 'G'), 1),
            `is`(8)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.leastInterval(charArrayOf('B', 'C', 'D', 'A', 'A', 'A', 'A', 'G', 'A', 'A'), 1),
            `is`(11)
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.leastInterval(charArrayOf('B', 'C', 'D', 'A', 'A', 'A', 'A', 'G', 'A', 'A'), 2),
            `is`(16)
        )
    }

    @Test
    fun `example 7`() {
        assertThat(
            sut.leastInterval(
                charArrayOf(
                    'A',
                    'A',
                    'A',
                    'A',
                    'A',
                    'A',
                    'B',
                    'C',
                    'D',
                    'E',
                    'F',
                    'G',
                    'H',
                    'I',
                    'J',
                    'K',
                    'L'
                ), 2
            ),
            `is`(17)
        )
    }

    @Test
    fun `example 8`() {
        assertThat(
            sut.leastInterval(charArrayOf('A', 'A', 'B', 'B', 'C', 'C', 'D', 'D'), 1),
            `is`(8)
        )
    }
}