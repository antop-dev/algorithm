package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P93Test {
    val sut = P93()

    @Test
    fun `example 01`() {
        assertThat(sut.restoreIpAddresses("25525511135"), containsInAnyOrder("255.255.11.135", "255.255.111.35"))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.restoreIpAddresses("0000"), containsInAnyOrder("0.0.0.0"))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.restoreIpAddresses("1111"), containsInAnyOrder("1.1.1.1"))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.restoreIpAddresses("010010"), containsInAnyOrder("0.10.0.10", "0.100.1.0"))
    }

    @Test
    fun `example 05`() {
        assertThat(
            sut.restoreIpAddresses("101023"),
            containsInAnyOrder("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3")
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            sut.restoreIpAddresses("172162541"),
            containsInAnyOrder(
                "17.216.25.41",
                "17.216.254.1",
                "172.16.25.41",
                "172.16.254.1",
                "172.162.5.41",
                "172.162.54.1"
            )
        )
    }

    @Test
    fun `example 07`() {
        assertThat(
            sut.restoreIpAddresses("19216811"),
            containsInAnyOrder(
                "1.92.168.11",
                "19.2.168.11",
                "19.21.68.11",
                "19.216.8.11",
                "19.216.81.1",
                "192.1.68.11",
                "192.16.8.11",
                "192.16.81.1",
                "192.168.1.1"
            )
        )
    }

    @Test
    fun `example 08`() {
        assertThat(
            sut.restoreIpAddresses("257244281111"),
            Matchers.empty()
        )
    }

}
