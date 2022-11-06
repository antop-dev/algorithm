package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/429
public class P131128 {
    public String solution(String X, String Y) {
        // 출현 숫자를 인덱스화 한다.
        int[] x = new int[10];
        int[] y = new int[10];
        // 카운팅
        for (char c : X.toCharArray()) {
            x[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            y[c - '0']++;
        }
        // 숫자 만들기
        int count = 0; // 일치하는 숫자 개수
        StringBuilder sb = new StringBuilder();
        for (int n = 9; n >= 0; n--) {
            int min = Math.min(x[n], y[n]);
            count += min;
            // 9 ~ 1 숫자이거나
            // (0일 경우) 앞에서 숫자가 하나라도 쓰인 경우
            // 즉 0일 경우 앞에 숫자가 하나도 안 쓰였으면 넘어간다.
            if (n >= 1 || (count - min) > 0) {
                while (min-- > 0) { // 숫자 채우기
                    sb.append(n);
                }
            }
        }

        if (count == 0) {
            return "-1";
        }

        return sb.length() > 0 ? sb.toString() : "0";
    }
}
