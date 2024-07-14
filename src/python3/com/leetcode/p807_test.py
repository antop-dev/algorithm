import unittest

import p807


class Test(unittest.TestCase):
    sut = p807.Solution()

    def test_1(self):
        grid = [
            [3, 0, 8, 4],
            [2, 4, 5, 7],
            [9, 2, 6, 3],
            [0, 3, 1, 0],
        ]
        self.assertEqual(self.sut.maxIncreaseKeepingSkyline(grid), 35)
