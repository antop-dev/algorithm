from typing import List


class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        n = len(grid)
        top = [0] * n
        left = [0] * n

        for y in range(n):
            for x in range(n):
                top[x] = max(top[x], grid[y][x])
                left[y] = max(left[y], grid[y][x])

        total = 0
        for y in range(n):
            for x in range(n):
                total += min(top[x], left[y]) - grid[y][x]

        return total
