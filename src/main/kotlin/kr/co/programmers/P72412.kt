package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/374
class P72412 {
    fun solution(info: Array<String>, query: Array<String>): IntArray {
        val aggregate = mutableMapOf<String, MutableList<Int>>()
        // 경우의 수를 집계한다.
        for (i in info.indices) {
            dfs(aggregate, "", 0, info[i].split(" "))
        }
        // 이진 탐색으로 숫자를 찾을 것이므로 점수를 오름차순 정렬
        for (e in aggregate.entries) {
            e.value.sort()
        }
        // 찾기
        val answer = IntArray(query.size)
        for (i in query.indices) {
            val split = query[i].replace(" and ", "").split(" ")
            answer[i] = search(aggregate, split[0], split[1].toInt())
        }
        return answer
    }

    private fun dfs(aggregate: MutableMap<String, MutableList<Int>>, key: String, depth: Int, info: List<String>) {
        if (depth == 4) {
            aggregate[key] = aggregate[key]?.run {
                this += info[4].toInt()
                this
            } ?: mutableListOf(info[4].toInt())
            return
        }
        dfs(aggregate, "$key-", depth + 1, info)
        dfs(aggregate, "$key${info[depth]}", depth + 1, info)
    }

    private fun search(aggregate: MutableMap<String, MutableList<Int>>, key: String, score: Int): Int {
        return aggregate[key]?.run {
            var start = 0
            var end = this.lastIndex
            while (start <= end) {
                val mid = (start + end) / 2
                if (this[mid] < score) {
                    start = mid + 1
                } else {
                    end = mid - 1
                }
            }
            this.size - start
        } ?: 0
    }

}
