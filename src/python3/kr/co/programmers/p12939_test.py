import unittest

import p12939


class Test(unittest.TestCase):

    def test_1(self):
        self.assertEqual(p12939.solution("1 2 3 4"), "1 4")

    def test_2(self):
        self.assertEqual(p12939.solution("-1 -2 -3 -4"), "-4 -1")

    def test_3(self):
        self.assertEqual(p12939.solution("-1 -1"), "-1 -1")
