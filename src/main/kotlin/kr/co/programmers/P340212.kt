package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/599
class P340212 {
    fun solution(diffs: IntArray, times: IntArray, limit: Long): Int {
        var (left, right) = minMax(diffs)
        var ans = right
        while (left <= right) { // 이진 탐색
            val level = (left + right) / 2
            val elapsed = play(diffs, times, level)
            if (elapsed <= limit) {
                ans = level
                right = level - 1
            } else {
                left = level + 1
            }
        }
        return ans
    }

    private fun play(diffs: IntArray, times: IntArray, level: Int): Long {
        var elapsed = 0L
        var prev = 0
        diffs.zip(times).forEach { (diff, time) ->
            if (diff > level) {
                elapsed += (prev + time) * (diff - level)
            }
            elapsed += time
            prev = time
        }
        return elapsed
    }

    private fun minMax(diffs: IntArray): Pair<Int, Int> {
        var min = 100001
        var max = 1
        for (diff in diffs) {
            if (diff < min) {
                min = diff
            }
            if (diff > max) {
                max = diff
            }
        }
        return min to max
    }
}
