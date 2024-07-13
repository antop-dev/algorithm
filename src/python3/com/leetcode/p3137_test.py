import unittest

import p3137


class Test(unittest.TestCase):
    sut = p3137.Solution()

    def test_1(self):
        operations = self.sut.minimumOperationsToMakeKPeriodic("leetcodeleet", 4)
        self.assertEqual(operations, 1)

    def test_2(self):
        operations = self.sut.minimumOperationsToMakeKPeriodic("leetcoleet", 2)
        self.assertEqual(operations, 3)
