package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/416
public class P87390 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        for (long i = left; i <= right; i++) {
            int y = (int) (i / n);
            int x = (int) (i - (y * n));
            int v = Math.max(y, x) + 1;
            answer[(int) (i - left)] = v;
        }
        return answer;
    }
}
