package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/389
class P92334 {

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        // Map<신고당한 아아디, Set<신고한 아이디>> : Set에 의해서 중복 신고를 처리한다.
        val map = mutableMapOf<String, MutableSet<String>>().apply {
            for (id in id_list) this[id] = mutableSetOf()
            report.map { it.split(" ") }
                    .forEach { this[it[1]]!! += it[0] }
        }
                .filter { it.value.size >= k }
                .flatMap { it.value }
                .groupingBy { it }
                .eachCount()

        return IntArray(id_list.size) { i -> map[id_list[i]] ?: 0 }
    }

}
