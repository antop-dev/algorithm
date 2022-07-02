package kr.co.programmers;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/405
public class P92342 {
    private static final int LENGTH = 11;
    private int diff = 0;
    private int[] history = new int[]{-1};


    public int[] solution(int n, int[] info) {
        // 어파치의 촘 점수
        int total = 0;
        for (int i = 0; i < LENGTH - 2; i++) {
            if (info[i] > 0) {
                total += 10 - i;
            }
        }
        dfs(n, info, new int[LENGTH], 0, total);
        return history;
    }

    private void dfs(int n, int[] apeach, int[] ryan, int k, int diff) {
        if (k == LENGTH) { // 0점까지 계산을 다 한 경우
            if (diff < 0) { // 차이가 음수이면 라이언이 어파치보다 점수가 더 높다는 것
                int[] arr = Arrays.copyOf(ryan, LENGTH);
                if (diff < this.diff) {
                    this.diff = diff;
                    history = arr;
                } else if (diff == this.diff) {
                    history = choose(arr, history);
                }
            }
            return;
        }
        // 라이언이 어파치보다 k번째 점수를 한발 더 많이 맞출 떄
        if (n > apeach[k]) {
            ryan[k] = apeach[k] + 1; // 어파치보다 한발 더 맞춘다
            int score = 10 - k;
            dfs(n - ryan[k], apeach, ryan, k + 1, diff - (apeach[k] > 0 ? score : 0) - score);
            ryan[k] = 0; // backtracking
        }
        // 라이언이 k번째 점수를 쏘지 않을 때
        if (k == LENGTH - 1) ryan[k] = n; // 마지막 0점에 남은 화살을 전부 소비한다.
        dfs(n, apeach, ryan, k + 1, diff);
    }

    // 낮은 점수를 더 많이 맞힌 기록을 선택
    private int[] choose(int[] x, int[] y) {
        for (int i = LENGTH - 1; i >= 0; i--) {
            if (x[i] > y[i]) {
                return x;
            } else if (y[i] > x[i]) {
                return y;
            }
        }
        return x;
    }

}
