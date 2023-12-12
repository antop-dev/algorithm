package kr.co.programmers

// https://github.com/antop-dev/algorithm/issuefs/529
class P72413 {
    companion object {
        // INF = (최대택시요금 * 최대지점수) + 1
        const val INF = (100_000 * 200) + 1
    }

    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
        val graph = floydWarshall(n, fares)
        // S : 합승 시작
        // C : 합승 도착
        // A : A 도착
        // B : B 도착
        var ans = INF
        for (c in 1..n) {
            // (S → C) + (C → A)
            //         + (C → B)
            // 택시요금이 가장 작은 택시요금을 찾는다.
            ans = minOf(ans, graph[s][c] + graph[c][a] + graph[c][b])
        }
        return ans
    }

    private fun floydWarshall(n: Int, fares: Array<IntArray>): Array<IntArray> {
        // 배열 초기화
        val graph = Array(n + 1) {
            IntArray(n + 1) { INF }
        }
        // 지점 → 지점 초기화
        for ((c, d, f) in fares) {
            graph[c][d] = f
            graph[d][c] = f
        }
        // 계산
        for (k in 1..n) {
            graph[k][k] = 0
            for (i in 1..n) {
                for (j in 1..n) {
                    graph[i][j] = minOf(graph[i][j], graph[i][k] + graph[k][j])
                }
            }
        }
        return graph
    }
}
