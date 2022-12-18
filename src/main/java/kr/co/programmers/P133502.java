package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/444
public class P133502 {
    public int solution(int[] ingredient) {
        int hamburger = 0;
        int p = 0;
        for (int item : ingredient) {
            ingredient[p++] = item; // 포인터는 이미 이동했다.
            if (p >= 4
                    && ingredient[p - 4] == 1
                    && ingredient[p - 3] == 2
                    && ingredient[p - 2] == 3
                    && ingredient[p - 1] == 1) {
                hamburger++;
                p -= 4;
            }
        }
        return hamburger;
    }

}
