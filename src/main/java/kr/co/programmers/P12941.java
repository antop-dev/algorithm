package kr.co.programmers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/555
public class P12941 {
    public int solution(int[] a, int[] b) {
        Queue<Integer> pq1 = priorityQueue(a, Comparator.naturalOrder());
        Queue<Integer> pq2 = priorityQueue(b, Comparator.reverseOrder());

        int ans = 0;
        while (!pq1.isEmpty() && !pq2.isEmpty()) {
            ans += pq1.remove() * pq2.remove();
        }
        return ans;
    }

    private PriorityQueue<Integer> priorityQueue(int[] arr, Comparator<Integer> comparator) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        for (int v : arr) {
            pq.offer(v);
        }
        return pq;
    }
}
