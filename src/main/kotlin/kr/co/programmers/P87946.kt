package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/392
class P87946 {

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        return dfs(k, dungeons.toMutableList(), 0)
    }

    fun dfs(k: Int, dungeons: MutableList<IntArray>, count: Int) : Int {
        if (dungeons.isEmpty()) return count
        var max = count
        repeat(dungeons.size) {
            val d = dungeons.removeAt(0)
            if (k >= d[0]) {
                val c = dfs(k - d[1], dungeons, count + 1)
                if (c > max) max = c
            }
            dungeons += d // back tracking
        }
        return max
    }

}
