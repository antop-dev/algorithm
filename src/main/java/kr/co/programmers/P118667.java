package kr.co.programmers;

import java.util.LinkedList;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/419
public class P118667 {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long diff = 0;

        for (int num : queue1) {
            q1.add(num);
            diff += num;
        }
        for (int num : queue2) {
            q2.add(num);
            diff -= num;
        }

        int count = 0;
        while (diff != 0) {
            if (diff > 0) { // queue1이 더 크다
                int num = q1.remove();
                diff -= num * 2L;
                q2.add(num);
            } else {
                int num = q2.remove();
                diff += num * 2L;
                q1.add(num);
            }
            count++;

            if (count > 600_000) {
                count = -1;
                break;
            }
        }

        return count;
    }
}
