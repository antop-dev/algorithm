from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        prev = None
        slow = head
        fast = head
        while fast is not None:
            fast = fast.next.next
            _next = slow.next
            slow.next = prev
            prev = slow
            slow = _next

        ans = 0
        while prev is not None:
            ans = max(ans, prev.val + slow.val)
            prev = prev.next
            slow = slow.next

        return ans
