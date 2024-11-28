package kr.co.programmers;

import java.util.LinkedList;

// https://github.com/antop-dev/algorithm/issues/603
public class P250136 {
    private final int[] dy = {-1, 0, 1, 0};
    private final int[] dx = {0, 1, 0, -1};

    public int solution(int[][] land) {
        var n = land.length;
        var m = land[0].length;
        var visited = new boolean[n][m];
        var xSum = new int[m];
        var ans = 0;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    // [count, minX, maxX]
                    var result = bfs(land, visited, n, m, i, j);
                    for (var k = result[1]; k <= result[2]; k++) {
                        xSum[k] += result[0];
                        ans = Math.max(ans, xSum[k]);
                    }
                }
            }
        }
        return ans;
    }

    private int[] bfs(int[][] land, boolean[][] visited, int n, int m, int i, int j) {
        var count = 0;
        var minX = j;
        var maxX = j;

        visited[i][j] = true;
        var queue = new LinkedList<int[]>();
        queue.add(new int[]{i, j});

        while (!queue.isEmpty()) {
            var pos = queue.poll();
            var y = pos[0];
            var x = pos[1];

            count++;
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);

            for (var k = 0; k < dy.length; k++) {
                var ny = y + dy[k];
                var nx = x + dx[k];
                if (0 <= ny && ny < n
                        && 0 <= nx && nx < m
                        && land[ny][nx] == 1
                        && !visited[ny][nx]
                ) {
                    queue.offer(new int[]{ny, nx});
                    visited[ny][nx] = true;
                }
            }
        }
        return new int[]{count, minX, maxX};
    }
}
