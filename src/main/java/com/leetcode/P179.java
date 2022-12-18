package com.leetcode;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/445
public class P179 {
    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = Integer.toString(nums[i]);
        }
        // 정렬!
        Arrays.sort(strings, (a, b) -> {
            String x = a + b;
            String y = b + a;
            return y.compareTo(x);
        });
        // 정렬 후 첫번째 수가 0이면 0이다.
        if (strings[0].equals("0")) {
            return "0";
        }
        // 숫자 완성
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}
