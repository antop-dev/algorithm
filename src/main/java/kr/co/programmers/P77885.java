package kr.co.programmers;

public class P77885 {

    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];

            if (num % 2 == 0) { // 짝수
                num += 1;
            } else { // 홀수
                long lastZero = (num + 1) & (-num);
                num = (num | lastZero) & (~(lastZero >> 1));
            }

            answer[i] = num;
        }

        return answer;
    }

}
