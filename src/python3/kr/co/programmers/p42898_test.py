import unittest

import p42898 as sut


class Test(unittest.TestCase):

    def test_example_1(self):
        self.assertEqual(sut.solution(4, 3, [[2, 2]]), 4)
