package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/373
public class P1743 {

    public int[] restoreArray(int[][] adjacentPairs) {
        int[] answer = new int[adjacentPairs.length + 1];
        // from -> [to, to, to] 구조로 만듬
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int[] pair : adjacentPairs) {
            if (!graph.containsKey(pair[0])) graph.put(pair[0], new HashSet<>());
            if (!graph.containsKey(pair[1])) graph.put(pair[1], new HashSet<>());
            graph.get(pair[0]).add(pair[1]);
            graph.get(pair[1]).add(pair[0]);
        }
        // DFS loop statement
        Deque<Integer> stack = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        // find the start
        for (Map.Entry<Integer, Set<Integer>> e : graph.entrySet()) {
            if (e.getValue().size() == 1) {
                stack.push(e.getKey());
                break;
            }
        }
        // start DFS
        int i = 0;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            answer[i++] = node;
            visited.add(node);

            for (Integer to : graph.get(node)) {
                if (!visited.contains(to)) {
                    stack.push(to);
                }
            }
        }

        return answer;
    }

}
