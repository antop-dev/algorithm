package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/423
public class P423 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // 숫자 -> 카운트
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.putIfAbsent(n, 0);
            map.computeIfPresent(n, (key, v) -> v + 1);
        }
        // 카운트만 우선순위 큐에 담는다
        Queue<Integer> pq = new PriorityQueue<>(map.size());
        for (Integer count : map.values()) {
            pq.offer(count);
        }
        // 계산
        while (k > 0 && k >= pq.peek()) {
            k -= pq.poll();
        }

        return pq.size();
    }
}
