package kr.co.programmers;

import java.util.Scanner;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 */
public class P12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int r = 0; r < b; r++) {
            for (int c = 0; c < a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
