package kr.co.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class P12911 {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int next = n + 1;
        while (next < Integer.MAX_VALUE) {
            if (count == Integer.bitCount(next)) {
                return next;
            }
            next++;
        }
        return next;
    }
}
