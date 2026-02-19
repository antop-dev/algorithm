package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P841Test {
    val sut = P841()

    @Test
    fun `example 01`() {
        val rooms = listOf(
            listOf(1),
            listOf(2),
            listOf(3),
            emptyList()
        )
        assertThat(sut.canVisitAllRooms(rooms), `is`(true))
    }

    @Test
    fun `example 02`() {
        val rooms = listOf(
            listOf(1, 3),
            listOf(3, 0, 1),
            listOf(2),
            listOf(0)
        )
        assertThat(sut.canVisitAllRooms(rooms), `is`(false))
    }
}
