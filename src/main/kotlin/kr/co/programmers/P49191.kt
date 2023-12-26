package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/532
class P49191 {
    fun solution(n: Int, results: Array<IntArray>): Int {
        // 승/패로 초기화
        val graph = Array(n) { IntArray(n) }
        for ((win, lose) in results) {
            graph[win - 1][lose - 1] = 1
            graph[lose - 1][win - 1] = -1
        }
        // 플로이드 와샬
        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (graph[i][k] == 1 && graph[k][j] == 1) {
                        graph[i][j] = 1
                        graph[j][i] = -1
                    }
                }
            }
        }
        // 경기 결과의 수가 (n-1)개면 이 선수의 순위를 알 수 있다.
        return graph.count { p ->
            p.count { it != 0 } == n - 1
        }
    }
}
