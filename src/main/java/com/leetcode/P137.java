package com.leetcode;

// https://github.com/antop-dev/algorithm/issues/355
public class P137 {
    public int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        for (int n : nums) {
            one = one ^ n & ~two;
            two = two ^ n & ~one;
        }
        return one;
    }
}
