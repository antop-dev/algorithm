package com.leetcode

// https://github.com/antop-dev/algorithm/issues/655
class P1079 {
    fun numTilePossibilities(tiles: String): Int {
        val made = mutableSetOf<String>()
        dfs(tiles, made, mutableSetOf(), StringBuilder())
        return made.size
    }

    /**
     * DFS + Backtracking
     *
     * @param tiles 주어진 문자열
     * @param made 만들어진 문자열 셋
     * @param used 사용된 인덱스 셋
     * @param sb 현재까지 만들어진 문자열
     */
    fun dfs(tiles: String, made: MutableSet<String>, used: MutableSet<Int>, sb: StringBuilder) {
        for (i in tiles.indices) {
            if (i in used || sb.toString() + tiles[i] in sb) {
                continue
            }

            used += i
            sb.append(tiles[i])
            made += sb.toString()

            dfs(tiles, made, used, sb)

            // backtracking
            used -= i
            sb.setLength(sb.length - 1)
        }
    }
}