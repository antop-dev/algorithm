import unittest

import p2740


class MyTestCase(unittest.TestCase):
    sut = p2740.Solution()

    def test_1(self):
        value = self.sut.findValueOfPartition([1, 3, 2, 4])
        self.assertEqual(value, 1)

    def test_2(self):
        value = self.sut.findValueOfPartition([100, 1, 10])
        self.assertEqual(value, 9)
