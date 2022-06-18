package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 맵에 해당 숫자의 마지막 인덱스 번호를 넣는다.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                if (i - map.get(n) <= k) {
                    return true;
                }
            }
            map.put(n, i);
        }
        return false;
    }
}
