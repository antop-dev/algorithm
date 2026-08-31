package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P419Test {
    private val sut = P419()

    private fun board(vararg rows: String): Array<CharArray> = Array(rows.size) { rows[it].toCharArray() }

    @Test
    fun `example 01`() {
        assertThat(sut.countBattleships(board("X..X", "...X", "...X")), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.countBattleships(board(".")), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.countBattleships(board("X")), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.countBattleships(board("XX")), `is`(1))
    }

    @Test
    fun `example 05`() {
        assertThat(sut.countBattleships(board("X.X")), `is`(2))
    }

    @Test
    fun `example 06`() {
        assertThat(sut.countBattleships(board("X", "X")), `is`(1))
    }

    @Test
    fun `example 07`() {
        assertThat(sut.countBattleships(board("X", ".", "X")), `is`(2))
    }

    @Test
    fun `example 08`() {
        assertThat(sut.countBattleships(board("....", "....", "....")), `is`(0))
    }

    @Test
    fun `example 09`() {
        assertThat(sut.countBattleships(board("XXXX")), `is`(1))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.countBattleships(board("X", "X", "X", "X")), `is`(1))
    }

    @Test
    fun `example 11`() {
        assertThat(sut.countBattleships(board("X.X.X", ".....", "X.X.X")), `is`(6))
    }

    @Test
    fun `example 12`() {
        assertThat(sut.countBattleships(board("XX..", "..XX", "X..X")), `is`(3))
    }

    @Test
    fun `example 13`() {
        assertThat(sut.countBattleships(board(".X.", "X.X", ".X.")), `is`(4))
    }

    @Test
    fun `example 14`() {
        assertThat(sut.countBattleships(board("X...", ".X..", "..X.", "...X")), `is`(4))
    }

    @Test
    fun `example 15`() {
        assertThat(sut.countBattleships(board("XXX.X", ".....")), `is`(2))
    }

    @Test
    fun `example 16`() {
        assertThat(sut.countBattleships(board("..X..", "..X..", "..X..")), `is`(1))
    }

    @Test
    fun `example 17`() {
        assertThat(sut.countBattleships(board("X.....X", ".......")), `is`(2))
    }

    @Test
    fun `example 18`() {
        assertThat(sut.countBattleships(board(".", "X", ".")), `is`(1))
    }

    @Test
    fun `example 19`() {
        assertThat(sut.countBattleships(board("XX.XX", ".....")), `is`(2))
    }

    @Test
    fun `example 20`() {
        assertThat(sut.countBattleships(board("X.X", "X.X", "X.X")), `is`(2))
    }

    @Test
    fun `example 21`() {
        assertThat(sut.countBattleships(board("....X", "....X", "X....")), `is`(2))
    }

    @Test
    fun `example 22`() {
        assertThat(sut.countBattleships(board(".....", ".XXX.", ".....")), `is`(1))
    }

    @Test
    fun `example 23`() {
        assertThat(sut.countBattleships(board("X....", "....X")), `is`(2))
    }

    @Test
    fun `example 24`() {
        assertThat(sut.countBattleships(board(".X..X", ".X..X", ".....", "X....")), `is`(3))
    }

    @Test
    fun `example 25`() {
        assertThat(sut.countBattleships(board("......", "......")), `is`(0))
    }

    @Test
    fun `example 26`() {
        assertThat(sut.countBattleships(board("X.X.X.X")), `is`(4))
    }

    @Test
    fun `example 27`() {
        assertThat(sut.countBattleships(board("X", ".", "X", ".", "X")), `is`(3))
    }

    @Test
    fun `example 28`() {
        assertThat(sut.countBattleships(board(".XX..", "....X", ".X..X")), `is`(3))
    }

    @Test
    fun `example 29`() {
        assertThat(sut.countBattleships(board(".X.", "...", "...")), `is`(1))
    }

    @Test
    fun `example 30`() {
        val board = Array(200) { i -> CharArray(200) { j -> if (i % 2 == 0 && j % 2 == 0) 'X' else '.' } }
        assertThat(sut.countBattleships(board), `is`(10000))
    }
}
