package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/425
class P118666 {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val map = mutableMapOf(
            'R' to 0,
            'T' to 0,
            'C' to 0,
            'F' to 0,
            'J' to 0,
            'M' to 0,
            'A' to 0,
            'N' to 0
        )

        for (i in choices.indices) {
            val s = survey[i]
            when (choices[i]) {
                in 1..3 -> map[s[0]] = map[s[0]]!! + 4 - choices[i]
                in 5..7 -> map[s[1]] = map[s[1]]!! + choices[i] - 4
            }
        }

        val sb = StringBuilder()
        val entries = map.entries.toList()
        for (i in 1 until entries.size step 2) {
            if (entries[i - 1].value >= entries[i].value) {
                sb.append(entries[i - 1].key)
            } else {
                sb.append(entries[i].key)
            }
        }
        return sb.toString()
    }
}
