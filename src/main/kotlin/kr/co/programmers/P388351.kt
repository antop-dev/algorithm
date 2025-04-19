package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/649
class P388351 {
    fun solution(schedules: IntArray, timeLogs: Array<IntArray>, startDay: Int): Int {
        return schedules.zip(timeLogs).count { (schedule, times) ->
            // 희망출근시간 + 10분
            val limit = schedule after 10
            // 정상출근 수
            val count = times.filterIndexed { i, time ->
                val day = (startDay - 1 + i) % 7 // 요일 (0:월요일, 6:일요일)
                day in 5..6 || time <= limit // 주말 or 정상출근
            }.count()
            // 정상출근이 7일이어야 함
            count == 7
        }
    }

    /** [minute]분 이후 시간 계산 */
    private infix fun Int.after(minute: Int): Int {
        var hh = this / 100
        var mm = (this % 100) + minute
        if (mm >= 60) {
            hh++
            mm -= 60
        }
        return (hh * 100) + mm
    }
}