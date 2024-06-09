import sys
import unittest


def solution(n):
    count = count_one(n)
    while n < sys.maxsize:
        n += 1
        if count == count_one(n):
            return n
    return n


def count_one(n):
    count = 0
    while n > 0:
        one = n & 1
        if one == 1:
            count += 1
        n >>= 1
    return count


class Test(unittest.TestCase):

    def test_example_1(self):
        self.assertEqual(solution(78), 83)

    def test_example_2(self):
        self.assertEqual(solution(15), 23)
