package com.codewars

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P5ce399e0047a45001c853c2bTest {
    val p = P5ce399e0047a45001c853c2b()

    @Test
    fun `example 01`() {
        assertThat(p.sumParts(intArrayOf(0, 1, 3, 6, 10)), `is`(intArrayOf(20, 20, 19, 16, 10, 0)));
    }

    @Test
    fun `example 02`() {
        assertThat(p.sumParts(intArrayOf(1, 2, 3, 4, 5, 6)), `is`(intArrayOf(21, 20, 18, 15, 11, 6, 0)));
    }

    @Test
    fun `example 03`() {
        assertThat(
                p.sumParts(intArrayOf(744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358)),
                `is`(intArrayOf(10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0))
        );
    }

}
