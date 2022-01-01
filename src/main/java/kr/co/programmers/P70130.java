package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/249
public class P70130 {
    public int solution(int[] a) {
        int answer = 0;
        // 출현하는 숫자의 횟수 카운트
        int[] counter = new int[a.length];
        for (int n : a) counter[n]++;

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) continue;
            // 현재수의 횟수가 만들어진 스타수열의 갯수보다 적으면 계산할 필요가 없다.
            if (counter[i] <= answer) continue;

            int make = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] != i && a[j + 1] != i) continue;
                if (a[j] == a[j + 1]) continue;
                make++;
                j++;
            }

            if (make > answer) {
                answer = make;
            }
        }

        return answer * 2;
    }
}
