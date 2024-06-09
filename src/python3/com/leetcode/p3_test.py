import unittest

import p3


class Test(unittest.TestCase):
    sut = p3.Solution()

    def test_example_1(self):
        self.assertEqual(self.sut.lengthOfLongestSubstring("abcabcbb"), 3)

    def test_example_2(self):
        self.assertEqual(self.sut.lengthOfLongestSubstring("bbbbb"), 1)

    def test_example_3(self):
        self.assertEqual(self.sut.lengthOfLongestSubstring("pwwkew"), 3)
