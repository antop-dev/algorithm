import unittest

import p12911


class Test(unittest.TestCase):

    def test_example_1(self):
        self.assertEqual(p12911.solution(78), 83)

    def test_example_2(self):
        self.assertEqual(p12911.solution(15), 23)
