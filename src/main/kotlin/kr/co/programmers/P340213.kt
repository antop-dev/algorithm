package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/641
class P340213 {
    fun solution(videoLen: String, pos: String, opStart: String, opEnd: String, commands: Array<String>): String {
        // 문자열 시간을 정수로 변경해서 처리
        // "13:23" -> 1323
        val videoLenInt = toInt(videoLen)
        val posInt = toInt(pos)
        val opStartInt = toInt(opStart)
        val opEndInt = toInt(opEnd)
        // 커맨드를 시간 증감 수치로 변경
        // 시작 위치가 오프닝 위치일 수도 있기 때문에 처음에 0 추가
        // ["prev", "next"] -> [0, 10, -10]
        val commandsInt = listOf(0) + commands.map { if (it == "prev") -10 else 10 }

        val ans = videoPlay(videoLenInt, posInt, opStartInt, opEndInt, commandsInt)
        return toTime(ans)
    }

    private fun videoPlay(videoLen: Int, pos: Int, opStart: Int, opEnd: Int, commands: List<Int>): Int {
        var time = pos
        commands.forEach { command ->
            time = move(time, command)
            if (time > videoLen) {
                time = videoLen
            }
            if (time < 0) {
                time = 0
            }
            if (time in opStart..opEnd) {
                time = opEnd
            }
        }
        return time
    }

    private fun move(time: Int, command: Int): Int {
        var minute = time / 100
        var second = (time % 100) + command
        if (second >= 60) { // 초가 60초를 넘어갈 경우
            minute++
            second -= 60
        } else if (second < 0) { // 초가 -일 경우
            minute--
            second += 60
        }
        return (minute * 100) + second
    }

    private fun toInt(s: String): Int {
        val (minute, second) = s.split(":").map { it.toInt() }
        return (minute * 100) + second
    }

    private fun toTime(time: Int) = buildString {
        append(padding(time / 100))
        append(":")
        append(padding(time % 100))
    }

    private fun padding(int: Int): String = int.toString().padStart(2, '0')
}
