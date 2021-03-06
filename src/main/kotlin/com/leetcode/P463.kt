package com.leetcode

// https://leetcode.com/problems/island-perimeter/
class P463 {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var perimeter = 0
        for (y in grid.indices) {
            for (x in grid[y].indices) {
                if (grid[y][x] == 1) {
                    perimeter += 4
                    // 위의 칸이 1이면 겹치는 선을 빼준다.
                    if (y > 0 && grid[y - 1][x] == 1) perimeter -= 2
                    // 왼쪽 칸이 1이면 겹치는 선을 빼준다.
                    if (x > 0 && grid[y][x - 1] == 1) perimeter -= 2
                }
            }
        }
        return perimeter
    }
}
