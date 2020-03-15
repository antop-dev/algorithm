package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12905
 */
public class P12905 {
    public int solution(int[][] board) {
        int rows = board.length;
        int cols = board.length > 0 ? board[0].length : 0;
        int max = 0;
        // dp 이용
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                if (y == 0 || x == 0) {
                    max = Math.max(max, board[y][x]);
                    continue;
                }
                if (board[y][x] == 1) {
                    board[y][x] = min(board[y - 1][x], board[y][x - 1], board[y - 1][x - 1]) + 1;
                    if (board[y][x] > max) {
                        max = board[y][x];
                    }
                }
            }
        }
        print(board);
        return max * max;
    }

    /**
     * 여러개의 값 중에 최소값을 구한다.
     *
     * @param values 값들 (가변 배열)
     * @return 최소값
     */
    private int min(int... values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    private void print(int[][] board) {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (x > 0) {
                    System.out.print(" ");
                }
                System.out.print(board[y][x]);
            }
            System.out.println();
        }
    }

}
