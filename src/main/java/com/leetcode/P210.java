package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/408
public class P210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // 진입 차수 (정점A로 몇개의 선이 연결되어 있는가?)
        int[] countToLink = new int[numCourses];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int num = 0; num < numCourses; num++) {
            graph.put(num, new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            // 정점A → [정점B, 정점C]
            graph.get(prerequisite[1]).add(prerequisite[0]);
            // 진입 차수 증가
            countToLink[prerequisite[0]]++;
        }

        // 선행 정점을 가지지 않는 정점을 큐에 넣음
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < countToLink.length; i++) {
            if (countToLink[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[countToLink.length];
        int i = 0;

        // 위상 정렬
        while (!queue.isEmpty()) {
            int v = queue.poll();
            result[i++] = v;
            // BFS
            for (int next : graph.get(v)) {
                countToLink[next]--;
                // 선행 정점을 가지지 않는 정점을 큐에 넣음
                if (countToLink[next] == 0) {
                    queue.add(next);
                }
            }
        }

        return (i == numCourses) ? result : new int[0];
    }

}
