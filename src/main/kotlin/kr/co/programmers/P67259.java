package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/450
public class P67259 {
    // 북, 동, 남, 서
    int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public int solution(int[][] board) {
        int n = board.length;
        // 벽이 아닌 칸을 최대 건설 비용으로 채운다.
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (board[y][x] != 1) {
                    board[y][x] = 97654321;
                }
            }
        }
        dfs(board, 0, 0, 0, 0);
        return board[n - 1][n - 1];
    }

    /**
     * DFS 탐색
     *
     * @param board 설계 도면
     * @param from  어디서왔는가. 0=남쪽에서 옴, 1=서쪽, 2=북쪽, 3=동쪽
     * @param sum   여기까지 온 건설 비용
     * @param y     현재 y 좌표
     * @param x     현재 x 좌표
     */
    private void dfs(int[][] board, int from, int sum, int y, int x) {
        int n = board.length;
        if (y < 0 || x < 0 || y >= n || x >= n || board[y][x] == 1) {
            return;
        }
        // 새로운 방향으로부터 왔을 때 현재 최소 비용 보다 크다면 중지
        if (board[y][x] < sum) {
            return;
        }
        // 적은 공사 비용으로 치환
        board[y][x] = sum;
        // 도착지
        if (y == n - 1 && x == n - 1) {
            return;
        }
        // 네방향으로 이동
        for (int i = 0; i < directions.length; i++) {
            int[] to = directions[i];
            if (y == 0 && x == 0) { // 시작 칸인 경우
                dfs(board, i, sum + 100, y + to[0], x + to[1]);
            } else if (from == i) { // 방향이 같은 경우
                dfs(board, i, sum + 100, y + to[0], x + to[1]);
            } else { // 방향이 다른 경우
                dfs(board, i, sum + 600, y + to[0], x + to[1]);
            }
        }
    }

}
