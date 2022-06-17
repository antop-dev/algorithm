package kr.co.programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/401
public class P86971 {

    public int solution(int n, int[][] wires) {
        // 그래프를 완성한다.
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) graph.put(i, new HashSet<>());
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        int answer = n;

        for (int[] wire : wires) {
            // 하나씩 잘라보고 계산한다.
            graph.get(wire[0]).remove(wire[1]);
            graph.get(wire[1]).remove(wire[0]);

            boolean[] voted = new boolean[n + 1];
            int count = 0;

            // BFS
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            while (!queue.isEmpty()) {
                int poll = queue.poll();
                if (voted[poll]) continue;
                voted[poll] = true;
                count++;

                for (Integer j : graph.get(poll)) queue.offer(j);
            }

            int diff = Math.abs((n - count) - count); // 두 전력망의 차이
            if (diff < answer) answer = diff;

            // 다시 넣기
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        return answer;
    }

}
