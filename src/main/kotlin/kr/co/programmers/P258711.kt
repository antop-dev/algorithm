package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/543
class P258711 {

    fun solution(edges: Array<IntArray>): IntArray {
        // <노드, [들어오는 간선 수, 나가는 간선 수]>
        val inOut = mutableMapOf<Int, IntArray>()
        for ((a, b) in edges) {
            inOut[a]?.let { it[1]++ } ?: run { inOut[a] = intArrayOf(0, 1) }
            inOut[b]?.let { it[0]++ } ?: run { inOut[b] = intArrayOf(1, 0) }
        }
        // [생성한 정점, 도넛, 막대, 8자]
        val ans = intArrayOf(0, 0, 0, 0)
        for ((node, count) in inOut) {
            val (inb, out) = count
            when {
                inb == 0 && out >= 2 -> ans[0] = node // 생성한 정점
                out == 0 -> ans[2]++ // 막대
                inb >= 2 && out >= 2 -> ans[3]++ // 8자
            }
        }
        // 도넛 = 전체 - 막대 - 8자
        ans[1] = inOut[ans[0]]!![1] - ans[2] - ans[3]

        return ans
    }

}
