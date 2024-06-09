# https://github.com/antop-dev/algorithm/issues/110
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans = 0
        _dict = {}
        anchor = 0
        for i, ch in enumerate(s):
            if s[i] in _dict:
                anchor = max(anchor, _dict[ch] + 1)
            ans = max(ans, i - anchor + 1)
            _dict[ch] = i
        return ans
