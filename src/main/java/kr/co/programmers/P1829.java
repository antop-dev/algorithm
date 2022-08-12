package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/414
public class P1829 {
    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] visited = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int element = picture[row][col];
                if (visited[row][col] || element == 0) continue;
                // bfs
                numberOfArea++;
                int sizeOfOneArea = bfs(picture, m, n, visited, row, col, element);
                if (sizeOfOneArea > maxSizeOfOneArea) {
                    maxSizeOfOneArea = sizeOfOneArea;
                }
            }
        }

        return new int[]{numberOfArea, maxSizeOfOneArea};
    }

    // 상,우,하,좌 방향
    private final int[][] directions = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    private int bfs(int[][] picture, int m, int n, boolean[][] visited, int row, int col, int element) {
        if (row < 0 || col < 0 || row >= m || col >= n || visited[row][col] || picture[row][col] != element) {
            return 0;
        }

        visited[row][col] = true;

        int size = 1;
        for (int[] d : directions) {
            size += bfs(picture, m, n, visited, row + d[0], col + d[1], element);
        }
        return size;
    }
}
