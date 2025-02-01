package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/626
class P172928 {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var ans = findStart(park)
        routes.forEach { route -> ans = walk(park, route, ans) }
        return ans
    }

    private fun findStart(park: Array<String>): IntArray {
        val pos = intArrayOf(0, 0)
        for (i in park.indices) {
            for (j in park[i].indices) {
                if (park[i][j] == 'S') {
                    pos[0] = i
                    pos[1] = j
                    break
                }
            }
        }
        return pos
    }

    private fun walk(park: Array<String>, route: String, start: IntArray): IntArray {
        val op = route[0]
        val n = route[2].digitToInt()
        var (y, x) = start
        repeat(n) {
            when (op) {
                'N' -> y--
                'E' -> x++
                'S' -> y++
                'W' -> x--
            }
            // 갈 수 없다면 원래 위치 리턴
            if (y !in park.indices || x !in park[0].indices || park[y][x] == 'X') {
                return start
            }
        }
        // 갈 수 있다면 이동된 위치 리턴
        return intArrayOf(y, x)
    }
}
