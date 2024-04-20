package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/351
class P42888 {
    private val msg = mapOf(
        "Enter" to "님이 들어왔습니다.",
        "Leave" to "님이 나갔습니다."
    )

    fun solution(record: Array<String>): Array<String> {
        // 유저 아이디에 해당하는 마지막 닉네임을 기록한다.
        val userIdToNickname = mutableMapOf<String, String>()
        // 유저아이디의 명령 히스토리 기록
        val history = mutableListOf<Pair<String, String>>()

        record.map { // 공백으로 분리
            it.split(" ")
        }.forEach {
            // it[0] = 명령 (Enter|Leave|Change)
            // it[1] = 유저 아이디
            // it[2] = 닉네임 (Leave일 경우 없음)
            val command = it[0]
            if (command == "Enter" || command == "Change") {
                userIdToNickname[it[1]] = it[2]
            }
            if (command == "Enter" || command == "Leave") {
                history.add(it[1] to command)
            }
        }

        return history.map { (userId, command) ->
            val lastNickname = userIdToNickname[userId]
            lastNickname + msg[command]
        }.toTypedArray()
    }

}
