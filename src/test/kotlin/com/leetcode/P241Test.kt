package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P241Test {
    val sut = P241()

    @Test
    fun `example 1`() {
        assertThat(
            sut.diffWaysToCompute("2-1-1"),
            containsInAnyOrder(0, 2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.diffWaysToCompute("2*3-4*5"),
            containsInAnyOrder(-34, -14, -10, -10, 10)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.diffWaysToCompute("1-2+3*4"),
            containsInAnyOrder(-13, -19, 11, -16, 8)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.diffWaysToCompute("12*3-4+6*2-17*31"),
            containsInAnyOrder(
                37788,
                33468,
                6168,
                33468,
                1848,
                63036,
                55836,
                6168,
                6120,
                32028,
                408,
                55836,
                408,
                -1080,
                -37812,
                -33492,
                -6192,
                -33492,
                -1872,
                44100,
                39060,
                -31500,
                -27900,
                -6480,
                -6528,
                -6192,
                -6492,
                -6204,
                33108,
                1488,
                56916,
                1488,
                0,
                -33852,
                -2232,
                39060,
                -27900,
                -11160,
                -12648,
                -2232,
                -11532,
                -2604,
                3182,
                2822,
                547,
                2822,
                187,
                5286,
                4686,
                547,
                543,
                2702,
                67,
                4686,
                67,
                -57,
                -3162,
                -2802,
                -527,
                -2802,
                -167,
                -3118,
                -2758,
                -483,
                -2758,
                -123,
                44100,
                39060,
                -31500,
                -27900,
                -13650,
                -12090,
                3150,
                2790,
                -19950,
                -17670,
                -683,
                -731,
                -395,
                -695,
                -407,
                -507,
                -511,
                -527,
                -483,
                -695,
                -407,
                -475,
                -539,
                -451,
                33108,
                1488,
                56916,
                1488,
                0,
                -33852,
                -2232,
                39060,
                -27900,
                -11160,
                -12648,
                -2232,
                -11532,
                -2604,
                3782,
                1147,
                5766,
                1147,
                1023,
                -3162,
                -527,
                -1798,
                837,
                39060,
                -27900,
                -12090,
                2790,
                -17670,
                -5363,
                -6851,
                3565,
                -5735,
                3193,
                93,
                -31,
                -527,
                837,
                -5735,
                3193,
                1085,
                -899,
                1829
            )
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.diffWaysToCompute("1+2-3*4"),
            containsInAnyOrder(-9, -3, -9, 0, 0)
        )
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.diffWaysToCompute("1+2-3*1+2-3"),
            containsInAnyOrder(
                3,
                3,
                1,
                -3,
                1,
                1,
                1,
                -1,
                -1,
                -9,
                -5,
                -5,
                -1,
                -1,
                3,
                3,
                1,
                -3,
                1,
                0,
                0,
                0,
                0,
                -1,
                -1,
                -1,
                -1,
                -1,
                -9,
                -5,
                -5,
                -1,
                -1,
                -9,
                -5,
                -3,
                -3,
                -1,
                -1,
                -1,
                -1,
                -1
            )
        )
    }

}
