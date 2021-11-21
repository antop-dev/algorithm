package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/351
class P42888 {
    private val msg = mapOf(
            "Enter" to "님이 들어왔습니다.",
            "Leave" to "님이 나갔습니다."
    )

    fun solution(record: Array<String>): Array<String> {
        val map = mutableMapOf<String, String>()
        val history = mutableListOf<List<String>>()
        record.map { it.split(" ") }.forEach {
            val c = it[0]
            if (c == "Enter" || c == "Change") map[it[1]] = it[2]
            if (c == "Enter" || c == "Leave") history.add(listOf(it[1], msg[c]!!))
        }

        return history.map { map[it[0]] + it[1] }.toTypedArray()
    }

}
