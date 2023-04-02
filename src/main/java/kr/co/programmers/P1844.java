package kr.co.programmers;

import java.util.LinkedList;
import java.util.Queue;

// https://github.com/antop-dev/algorithm/issues/477
public class P1844 {

    public int solution(int[][] maps) {
        // init
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        int n = maps.length;
        int m = maps[0].length;
        int answer = 0;
        // bfs
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        maps[0][0] = 0;

        loop:
        while (!queue.isEmpty()) {
            answer++;
            int size = queue.size();
            while (size-- > 0) {
                int[] p = queue.poll();
                int y = p[0];
                int x = p[1];
                if (y == n - 1 && x == m - 1) { // 도착
                    break loop;
                }
                // ↑, →, ↓, ←
                for (int i = 0; i < dx.length; i++) {
                    int nextY = y + dy[i];
                    int nextX = x + dx[i];
                    if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < m
                            && maps[nextY][nextX] == 1) {
                        queue.offer(new int[]{nextY, nextX});
                        maps[nextY][nextX] = 0; // 방문 → 벽
                    }
                }
            }

        }
        return (maps[n - 1][m - 1] == 0) ? answer : -1;
    }
}
