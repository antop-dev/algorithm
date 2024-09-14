package com.leetcode

// https://github.com/antop-dev/algorithm/issues/582
class P1007 {
    fun minDominoRotations(tops: IntArray, bottoms: IntArray): Int {
        var ans = Int.MAX_VALUE
        for (num in 1..6) {
            val count = checkRotations(tops, bottoms, num)
            ans = minOf(ans, count)
        }
        if (ans == Int.MAX_VALUE) {
            ans = -1
        }
        return ans
    }

    /**
     * [num]을 한 줄로 만들기 위해서 아래→위, 위→아래 이동 중 적은 회수 구하기
     */
    private fun checkRotations(tops: IntArray, bottoms: IntArray, num: Int): Int {
        var bottomToTop = 0 // 아래 주사위로 위로 바꾸는 회수
        var topToBottom = 0 // 위 주사위를 아래로 바꾸는 회수
        tops.zip(bottoms) { top, bottom ->
            if (num != top && num != bottom) {
                return Int.MAX_VALUE
            }
            if (num != top) {
                bottomToTop++
            }
            if (num != bottom) {
                topToBottom++
            }
        }
        return minOf(bottomToTop, topToBottom)
    }


}
