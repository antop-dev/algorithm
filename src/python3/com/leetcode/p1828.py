import math
from typing import List


class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        ans = [0] * len(queries)
        for i in range(len(queries)):
            px, py, r = queries[i]
            ans[i] = self.count(px, py, r, points)
        return ans

    def count(self, qx, qy, r, points):
        count = 0
        for px, py in points:
            if qx - r <= px <= qx + r \
                    and qy - r <= py <= qy + r \
                    and self.distance(qx, qy, px, py) <= r:
                count += 1
        return count

    def distance(self, qx, qy, px, py):
        x_dist = px - qx
        y_dist = py - qy
        return math.sqrt(x_dist ** 2 + y_dist ** 2)
