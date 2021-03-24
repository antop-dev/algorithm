package kr.co.programmers;

import java.util.HashSet;
import java.util.Set;

// https://programmers.co.kr/learn/courses/30/lessons/1845
public class P219 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return Math.min(nums.length / 2, set.size());
    }
}
