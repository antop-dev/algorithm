package kr.co.programmers

class P42579 {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        // 해시 구조로 저장
        // 장르 : [<인덱스, 재생 횟수>, ..., ...]
        val hash = mutableMapOf<String, MutableList<IntArray>>().apply {
            for (i in plays.indices) {
                val genre = genres[i]
                val play = plays[i]
                val data = intArrayOf(i, play)
                this[genre] = (this[genre] ?: mutableListOf()).apply { add(data) }
            }
        }

        // 장르의 총 재생 횟수로 내림차순 정렬
        val sorted = hash.toList()
                .sortedWith(compareByDescending { it -> it.second.sumBy { it[1] } })
        // 장르 내에서 재생 횟수로 내림차순 정렬
        sorted.forEach { pair -> pair.second.sortByDescending { it[1] } }

        // 장르별 두 개씩 추출
        var answer = mutableListOf<Int>()
        for (pair in sorted) {
            answer.addAll(pair.second.take(2).map { it[0] })
        }

        return answer.toIntArray()
    }
}
