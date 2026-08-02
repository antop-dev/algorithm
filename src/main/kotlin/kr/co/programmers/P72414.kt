package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/770
class P72414 {
    fun solution(play_time: String, adv_time: String, logs: Array<String>): String {
        val playTime = play_time.toTimeInt()
        val advTime = adv_time.toTimeInt()
        val n = playTime + 1
        // 초당 시청자 수 계산
        val times = LongArray(n)
        for (log in logs) {
            val (s, e) = log.split("-")
            times[s.toTimeInt()]++
            times[e.toTimeInt()]--
        }
        for (i in 1 until times.size) {
            times[i] = times[i - 1] + times[i]
        }
        // 시간대의 누적시청자수로 누적합한다.
        val acc = LongArray(n + 1)
        for (i in 0 until n) {
            acc[i + 1] = acc[i] + times[i]
        }
        // 광고 구간별 높은 점수의 시작 시간 기록
        // 같은 점수라면 시작 시간이 가장 빠른 것을 기록한다.
        var best = -1L
        var ans = 0
        for (s in 0..(playTime - advTime)) {
            val sum = acc[s + advTime] - acc[s]
            if (sum > best) {
                best = sum
                ans = s
            }
        }
        // 문자열로 변경
        return ans.toTimeString()
    }

    private fun String.toTimeInt(): Int {
        val split = split(":")
        return (split[0].toInt() * 3600) + (split[1].toInt() * 60) + split[2].toInt()
    }

    private fun Int.toTimeString(): String {
        val h = this / 3600
        val m = (this % 3600) / 60
        val s = this % 60
        return String.format("%02d:%02d:%02d", h, m, s)
    }
}
