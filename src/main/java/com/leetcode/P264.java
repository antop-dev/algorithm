package com.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/410
public class P264 {

    public int nthUglyNumber(int n) {
        int[] multiples = new int[]{2, 3, 5};

        Queue<Long> pq = new PriorityQueue<>();
        pq.add(1L);

        int count = 0;
        long num = 1;
        while (count < n) {
            num = pq.remove();
            for (int m : multiples) {
                long x = num * m;
                if (!pq.contains(x)) {
                    pq.add(x);
                }
            }
            count++;
        }

        return (int) num;
    }

}
