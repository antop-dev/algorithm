package net.acmicpc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/17136
 */
public class P17136 {

    static int paper[] = {0, 5, 5, 5, 5, 5};
    static int box[][] = new int[10][10];
    static int min = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                box[y][x] = sc.nextInt();
            }
        }

        dfs(0, 0);
        System.out.println(min == 100 ? -1 : min);
    }

    public static void dfs(int idx, int cnt) {
//        System.out.println();
//        System.out.println("idx = " + idx + ", cnt = " + cnt + ", paper = " + Arrays.toString(paper));
//        print();

        if (idx == 100) {
            min = Math.min(min, cnt);
            return;
        }
        if (min <= cnt) return;

        int r = idx / 10;
        int c = idx % 10;

        if (box[r][c] == 1) {
            for (int i = 5; i > 0; i--) {
                if (paper[i] > 0) {
                    if (check(r, c, i)) {
                        fill(r, c, i, 0);
                        paper[i]--;
                        dfs(idx + 1, cnt + 1);
                        fill(r, c, i, 1);
                        paper[i]++;
                    }
                }
            }
        } else {
            dfs(idx + 1, cnt);
        }
    }

    private static void print() {
        for (int[] row : box) {
            for (int i = 0; i < row.length; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(row[i]);
            }
            System.out.println();
        }
    }

    public static boolean check(int r, int c, int len) {
        if (r + len > 10 || c + len > 10) return false;
        for (int i = r; i < r + len; i++)
            for (int j = c; j < c + len; j++)
                if (box[i][j] == 0) return false;
        return true;
    }

    public static void fill(int r, int c, int len, int status) {
        for (int i = r; i < r + len; i++)
            for (int j = c; j < c + len; j++)
                box[i][j] = status;
    }

}
