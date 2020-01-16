package net.acmicpc;

import java.util.Scanner;

public class P2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        long total = 0;
        int i = 0;
        while (y > 0) {
            int n = y % 10; // 마지막 한자리
            long d = x * n;
            total += d * Math.pow(10, i++);
            y = y / 10;

            System.out.println(d);
        }

        System.out.println(total);
    }

}