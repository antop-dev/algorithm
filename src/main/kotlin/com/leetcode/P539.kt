package com.leetcode

// https://github.com/antop-dev/algorithm/issues/514
class P539 {
    fun findMinDifference(timePoints: List<String>): Int {
        // 문자열을 분으로 변경
        val times = mutableListOf<Int>()
        for (s in timePoints) {
            val time = time(s)
            times += time
            // 다음날 시간
            if (time < 13 * 60) times += (24 * 60) + time
        }
        // 오름차순 정렬
        times.sort()
        // 가장 작은 시간 차이 구하기
        var minDiff = 24 * 60
        for (i in 1 until times.size) {
            val diff = times[i] - times[i - 1]
            if (diff < minDiff) minDiff = diff
        }
        return minDiff
    }

    /**
     * time string to int
     */
    private fun time(s: String) =
        s.split(":")
            .map { it.toInt() }
            .let {
                val (hh, mm) = it
                (hh * 60) + mm
            }

}
