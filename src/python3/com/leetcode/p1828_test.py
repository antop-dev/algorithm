import unittest

import p1828


class Test(unittest.TestCase):
    sut = p1828.Solution()

    def test_example_1(self):
        points = [[1, 3], [3, 3], [5, 3], [2, 2]]
        queries = [[2, 3, 1], [4, 3, 1], [1, 1, 2]]
        ans = self.sut.countPoints(points, queries)
        self.assertEqual(ans, [3, 2, 2])

    def test_example_2(self):
        points = [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5]]
        queries = [[1, 2, 2], [2, 2, 2], [4, 3, 2], [4, 3, 3]]
        ans = self.sut.countPoints(points, queries)
        self.assertEqual(ans, [2, 3, 2, 4])
