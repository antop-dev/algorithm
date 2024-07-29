import unittest

import p2130


class MyTestCase(unittest.TestCase):
    sut = p2130.Solution()

    def test_1(self):
        node4 = p2130.ListNode(1)
        node3 = p2130.ListNode(2, node4)
        node2 = p2130.ListNode(4, node3)
        head = p2130.ListNode(5, node2)
        self.assertEqual(self.sut.pairSum(head), 6)

    def test_2(self):
        node4 = p2130.ListNode(3)
        node3 = p2130.ListNode(2, node4)
        node2 = p2130.ListNode(2, node3)
        head = p2130.ListNode(4, node2)
        self.assertEqual(self.sut.pairSum(head), 7)

    def test_3(self):
        head = p2130.ListNode(1, p2130.ListNode(100000))
        self.assertEqual(self.sut.pairSum(head), 100000 + 1)
