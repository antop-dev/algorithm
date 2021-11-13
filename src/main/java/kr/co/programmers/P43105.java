package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/349
public class P43105 {
    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            int[] row = triangle[i];

            for (int j = 0; j < row.length; j++) {
                if (j == 0) {
                    row[j] += triangle[i - 1][j];
                } else if (j == row.length - 1) {
                    row[j] += triangle[i - 1][j - 1];
                } else {
                    row[j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }

                if (row[j] > answer) {
                    answer = row[j];
                }
            }
        }

        return answer;
    }
}
