package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P638Test {
    val sut = P638()

    @Test
    fun `example 1`() {
        assertThat(
            sut.shoppingOffers(
                price = listOf(2, 5),
                special = listOf(
                    listOf(3, 0, 5),
                    listOf(1, 2, 10),
                ),
                needs = listOf(3, 2)
            ),
            `is`(14)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.shoppingOffers(
                price = listOf(2, 3, 4),
                special = listOf(
                    listOf(1, 1, 0, 4),
                    listOf(2, 2, 1, 9),
                ),
                needs = listOf(1, 2, 1)
            ),
            `is`(11)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.shoppingOffers(
                price = listOf(0, 0, 0),
                special = listOf(
                    listOf(1, 1, 0, 4),
                    listOf(2, 2, 1, 9),
                ),
                needs = listOf(2, 2, 1)
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.shoppingOffers(
                price = listOf(7, 6, 1, 1, 10, 7),
                special = listOf(
                    listOf(4, 6, 6, 2, 2, 6, 29),
                    listOf(5, 4, 4, 5, 3, 5, 24),
                    listOf(0, 4, 6, 1, 2, 0, 9),
                    listOf(4, 3, 2, 6, 6, 1, 4),
                    listOf(2, 4, 6, 6, 3, 4, 30),
                    listOf(4, 3, 0, 2, 5, 3, 20),
                    listOf(1, 1, 0, 6, 6, 4, 16),
                    listOf(6, 3, 0, 3, 4, 2, 13),
                    listOf(3, 3, 6, 4, 1, 6, 21),
                    listOf(2, 3, 1, 6, 4, 6, 26),
                    listOf(3, 2, 3, 2, 4, 3, 16),
                    listOf(1, 6, 0, 0, 0, 0, 20),
                    listOf(4, 1, 5, 5, 4, 4, 19),
                    listOf(3, 1, 4, 4, 4, 3, 19),
                    listOf(0, 2, 1, 3, 5, 5, 22),
                    listOf(2, 6, 5, 1, 5, 4, 30),
                    listOf(5, 4, 5, 0, 3, 1, 18),
                    listOf(6, 4, 6, 2, 5, 1, 11),
                    listOf(1, 2, 1, 1, 5, 0, 23),
                    listOf(1, 5, 5, 1, 5, 2, 31),
                    listOf(1, 6, 3, 5, 1, 0, 12),
                    listOf(5, 6, 2, 2, 3, 0, 20),
                    listOf(2, 6, 2, 1, 2, 1, 2),
                    listOf(5, 1, 2, 6, 5, 5, 3),
                    listOf(1, 5, 2, 2, 2, 5, 15),
                    listOf(4, 3, 4, 0, 3, 4, 3),
                    listOf(6, 2, 4, 6, 0, 4, 2),
                    listOf(2, 3, 0, 0, 3, 0, 3),
                    listOf(1, 6, 6, 0, 4, 6, 2),
                    listOf(5, 2, 1, 2, 6, 3, 16),
                    listOf(0, 0, 0, 6, 1, 4, 14),
                    listOf(1, 0, 4, 3, 3, 3, 27),
                    listOf(4, 3, 5, 3, 0, 2, 17),
                    listOf(3, 1, 4, 1, 3, 5, 25),
                    listOf(0, 1, 1, 5, 6, 1, 12),
                    listOf(0, 3, 0, 6, 3, 2, 9),
                    listOf(5, 5, 1, 0, 2, 6, 14),
                    listOf(2, 6, 5, 5, 0, 2, 20),
                    listOf(2, 0, 0, 0, 6, 6, 11),
                    listOf(6, 0, 2, 4, 2, 2, 17),
                    listOf(5, 2, 2, 1, 1, 4, 12),
                    listOf(1, 1, 4, 3, 1, 2, 29),
                    listOf(6, 5, 4, 1, 3, 3, 24),
                    listOf(3, 2, 6, 0, 1, 6, 9),
                    listOf(3, 6, 4, 6, 1, 0, 11),
                    listOf(2, 4, 1, 3, 3, 3, 16),
                    listOf(4, 5, 3, 4, 1, 5, 19),
                    listOf(5, 1, 3, 6, 2, 0, 24),
                    listOf(3, 6, 6, 6, 5, 4, 5),
                    listOf(0, 4, 4, 0, 6, 3, 31),
                    listOf(2, 6, 0, 5, 3, 1, 12),
                    listOf(2, 6, 1, 5, 1, 5, 17),
                    listOf(1, 3, 1, 4, 3, 1, 8),
                    listOf(6, 3, 4, 4, 0, 0, 20),
                    listOf(4, 3, 0, 4, 1, 0, 5),
                    listOf(2, 6, 0, 2, 5, 2, 4),
                    listOf(4, 5, 5, 5, 1, 5, 10),
                    listOf(2, 6, 1, 2, 2, 6, 3),
                    listOf(0, 6, 2, 2, 0, 2, 4),
                    listOf(6, 0, 0, 1, 6, 5, 21),
                    listOf(3, 0, 3, 0, 3, 1, 31),
                    listOf(5, 6, 6, 5, 3, 1, 18),
                    listOf(3, 0, 3, 1, 4, 3, 24),
                    listOf(4, 6, 1, 2, 4, 1, 18),
                    listOf(2, 6, 3, 5, 5, 6, 7),
                    listOf(1, 1, 2, 4, 5, 2, 19),
                    listOf(2, 3, 6, 3, 1, 2, 23),
                    listOf(3, 6, 6, 5, 3, 0, 5),
                    listOf(5, 1, 2, 0, 6, 5, 30),
                    listOf(2, 5, 0, 3, 4, 2, 19),
                    listOf(0, 2, 2, 0, 3, 6, 16),
                    listOf(4, 2, 0, 5, 6, 6, 22),
                    listOf(0, 0, 4, 5, 6, 6, 23),
                    listOf(3, 3, 0, 5, 1, 5, 10),
                    listOf(3, 1, 1, 3, 3, 1, 12),
                    listOf(0, 0, 6, 2, 0, 6, 12),
                    listOf(6, 5, 3, 4, 5, 0, 31),
                    listOf(3, 5, 5, 6, 1, 3, 4),
                    listOf(0, 2, 5, 3, 3, 4, 22),
                    listOf(4, 5, 1, 2, 3, 0, 9),
                    listOf(4, 6, 2, 1, 3, 5, 28),
                    listOf(6, 5, 0, 2, 3, 5, 22),
                    listOf(4, 1, 5, 2, 1, 3, 25),
                    listOf(4, 0, 3, 0, 3, 2, 4),
                    listOf(6, 3, 5, 1, 0, 0, 13),
                    listOf(3, 5, 0, 3, 2, 0, 30),
                    listOf(3, 3, 5, 6, 2, 1, 27),
                    listOf(4, 2, 0, 6, 2, 1, 23),
                    listOf(3, 3, 2, 3, 6, 5, 12),
                    listOf(5, 4, 5, 1, 0, 5, 19),
                    listOf(2, 3, 6, 6, 4, 2, 16),
                    listOf(5, 4, 6, 0, 6, 4, 13),
                    listOf(0, 5, 4, 3, 2, 4, 11),
                    listOf(6, 2, 0, 4, 6, 5, 14),
                    listOf(0, 4, 6, 0, 5, 3, 18),
                    listOf(1, 6, 2, 6, 1, 2, 21),
                    listOf(5, 4, 5, 5, 3, 2, 29),
                    listOf(3, 6, 4, 2, 0, 4, 18),
                    listOf(4, 1, 2, 4, 3, 1, 14),
                    listOf(1, 5, 2, 2, 2, 3, 27)
                ),
                needs = listOf(6, 6, 6, 6, 6, 6)
            ),
            `is`(28)
        )
    }
}