package com.leetcode

// https://github.com/antop-dev/algorithm/issues/776
class P1386 {
    companion object {
        const val INIT = 0b0000000000 // 모두 빈자리
        const val A = 0b0111100000 // 2~5번 자리
        const val B = 0b0001111000 // 4~7번 자리
        const val C = 0b0000011110 // 6~9번 자리
    }

    fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int {
        reservedSeats.sortBy { (row, _) -> row }
        var ans = 0
        var prev = 1
        var bits = INIT
        for ((row, seat) in reservedSeats) {
            if (row > prev) {
                ans += count(bits)
                ans += (row - prev - 1) * 2
                prev = row
                bits = INIT
            }
            bits = bits or (1 shl 10 - seat)
        }
        // 이전 시트까지의 누적수 + 남은 빈 줄 + 마지막 시트수
        return ans + ((n - prev) * 2) + count(bits)
    }

    private fun count(bits: Int): Int {
        return when {
            bits and A == 0 && bits and C == 0 -> 2
            bits and A == 0 || bits and B == 0 || bits and C == 0 -> 1
            else -> 0
        }
    }
}
