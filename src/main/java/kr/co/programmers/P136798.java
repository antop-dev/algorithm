package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/447
public class P136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int n = 1; n <= number; n++) {
            int v = countDivisor(n);
            if (v > limit) {
                v = power;
            }
            answer += v;
        }
        return answer;
    }

    /**
     * 약수의 개수 구하기
     *
     * @param n 주어 진 수
     * @return 약수의 개수
     */
    private int countDivisor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) count++;
            else if (n % i == 0) count += 2;
        }
        return count;
    }

}
