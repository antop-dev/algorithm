import unittest

import p12913


class MyTestCase(unittest.TestCase):
    def test_1(self):
        land = [
            [1, 2, 3, 5],
            [5, 6, 7, 8],
            [4, 3, 2, 1],
        ]
        self.assertEqual(p12913.solution(land), 16)  # add assertion here
