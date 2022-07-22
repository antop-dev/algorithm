package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/411
class P12978 {
    companion object {
        const val INF = 500_001 // 최대 시간은 K + 1
    }

    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        if (N == 1) return 1
        // 행노드 -> 열노드간의 거리를 2차원 배열에 담는다.
        val graph = makeGraph(N, road)
        // 노드 방문 여부
        val visited = BooleanArray(N + 1)
        // 이동 시간
        val times = IntArray(N + 1) {
            if (it >= 2) INF else 0
        }
        var node = 1 // 1번 마을에서 시작
        while (node != INF) {
            visited[node] = true
            // 갈 수 있는 노드 계산
            for (i in 1..N) {
                if (visited[i]) continue
                if (graph[node][i] == INF) continue
                // 시간 갱신
                if (times[node] + graph[node][i] < times[i]) {
                    times[i] = times[node] + graph[node][i]
                }
            }
            // 가장 최소 시간를 가지는 노드를 구한다.
            node = run {
                var min = INF
                var idx = INF
                for (i in 1 .. N) {
                    if (!visited[i] && times[i] < min) {
                        min = times[i]
                        idx = i
                    }
                }
                idx
            }
        }
        // K 시간 이하로 배달이 가능한 노드 개수 세기
        var answer = 0
        for (i in 1 until times.size) {
            if (times[i] <= k) answer++
        }
        return answer
    }

    private fun makeGraph(N: Int, road: Array<IntArray>): Array<IntArray> {
        val graph = Array(N + 1) {
            IntArray(N + 1)
        }
        // 디폴트를 0 또는 INF
        for (i in 1..N) {
            for (j in 1..N) {
                if (i == j) continue
                graph[i][j] = INF
            }
        }
        // 마을간에 여러개의 길이 있을 수 있으므로 최단 거리만 남긴다.
        for (r in road) {
            if (r[2] < graph[r[0]][r[1]]) {
                graph[r[0]][r[1]] = r[2]
            }
            if (r[2] < graph[r[1]][r[0]]) {
                graph[r[1]][r[0]] = r[2]
            }
        }
        return graph
    }

}
