class Solution(object):
    def findValueOfPartition(self, nums):
        nums.sort()
        ans = 1000000000  # 1_000_000_000
        for i in range(len(nums) - 1):
            diff = nums[i + 1] - nums[i]
            ans = min(ans, diff)
        return ans
