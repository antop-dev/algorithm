package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/633
class P150370 {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val termsArray = termsArray(terms)
        return privacies
            .map { it.split(" ") }
            .mapIndexed { i, split ->
                val (date, type) = split
                val period = termsArray[type[0] - 'A']
                val a = dateToInt(date).plusMonth(period)
                val b = dateToInt(today)
                if (a < b) i + 1 else -1
            }
            .filter { it != -1 }
            .toIntArray()
    }

    private fun termsArray(terms: Array<String>): IntArray {
        val arr = IntArray(26)
        terms
            .map { it.split(" ") }
            .forEach { (type, period) -> arr[type[0] - 'A'] = period.toInt() }
        return arr
    }

    private fun dateToInt(date: String): Int {
        val (y, m, d) = date.split(".").map { it.toInt() }
        return (y * 10000) + (m * 100) + d
    }

    private fun Int.plusMonth(period: Int): Int {
        var v = this
        // + 유효기간(개월)
        val m = (v / 100 % 100) + period
        v -= v / 100 % 100 * 100 // 월을 0으로 만듬

        v += m / 12 * 10000 // 12개월 넘치면 년+
        v += m % 12 * 100 // 개월+
        if (v / 100 % 100 == 0) { // 2024.11.02 + 1개월 → 2025.00.02 → 2024.12.02
            v -= 10000
            v += 1200
        }
        // 하루 빼기
        if (v % 100 == 1) { // YYYY.XX.01
            if (v / 100 % 100 == 1) { // YYYY.01.01 → (YYYY-1).12.28
                v -= 10000
                v += (12 - (v / 100 % 100)) * 100
            } else { // YYYY.XX.01 → YYYY.(XX-1).28
                v -= 100
            }
            v += 27
        } else {
            v--
        }
        return v
    }
}
