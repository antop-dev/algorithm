package kr.co.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class P12911 {
    public int solution(int n) {
        int count = countBit(n);
        while (++n < Integer.MAX_VALUE) {
            if (count == countBit(n)) {
                return n;
            }
        }
        return n;
    }

    private int countBit(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
