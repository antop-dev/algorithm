package net.acmicpc;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2869
 */
public class P2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int X = (int) Math.ceil((double) (V - B) / (A - B));
        System.out.println(X);
    }
}
