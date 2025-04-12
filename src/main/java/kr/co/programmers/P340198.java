package kr.co.programmers;

import java.util.Arrays;

// https://github.com/antop-dev/algorithm/issues/644
public class P340198 {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for (int k = mats.length - 1; k >= 0; k--) {
            int mat = mats[k];
            for (int i = 0; i <= park.length - mat; i++) {
                for (int j = 0; j <= park[i].length - mat; j++) {
                    if (park[i][j].equals("-1") && calc(park, i, j, mat)) {
                        return mat;
                    }
                }
            }
        }
        return -1;
    }

    private boolean calc(String[][] park, int i, int j, int mat) {
        for (int y = i; y < i + mat; y++) {
            for (int x = j; x < j + mat; x++) {
                if (!park[y][x].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
