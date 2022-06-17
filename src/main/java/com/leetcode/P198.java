package com.leetcode;

// https://github.com/antop-dev/algorithm/issues/400
public class P198 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        nums[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
        }
        return nums[nums.length - 1];
    }
}
