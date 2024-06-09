import unittest

import p33


class Test(unittest.TestCase):
    sut = p33.Solution()

    def test_example_1(self):
        i = self.sut.search([4, 5, 6, 7, 0, 1, 2], 0)
        self.assertEqual(i, 4)

    def test_example_2(self):
        i = self.sut.search([4, 5, 6, 7, 0, 1, 2], 3)
        self.assertEqual(i, -1)
