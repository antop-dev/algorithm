package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class P935Test {
    val sut = P935()

    @ParameterizedTest(name = "n = {0}, ans = {1}")
    @MethodSource("provideParameters")
    fun example(n: Int, ans: Int) {
        assertThat(sut.knightDialer(n), `is`(ans))
    }

    companion object {
        @JvmStatic
        fun provideParameters(): Stream<Arguments> = Stream.of(
            Arguments.of(1, 10),
            Arguments.of(2, 20),
            Arguments.of(3, 46),
            Arguments.of(4, 104),
            Arguments.of(5, 240),
            Arguments.of(6, 544),
            Arguments.of(7, 1256),
            Arguments.of(8, 2848),
            Arguments.of(9, 6576),
            Arguments.of(10, 14912),
            Arguments.of(3131, 136006598),
            Arguments.of(5000, 406880451),
        )
    }

}
