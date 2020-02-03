package net.acmicpc;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/13458
 */
public class P13458 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 시험장의 개수
        int N = sc.nextInt();
        // 각 시험장에 있는 응시자의 수
        int[] r = new int[N];
        for (int i = 0; i < N; i++) {
            r[i] = sc.nextInt();
        }
        // 총감독관이 한 방에서 감시할 수 있는 응시자의 수
        int B = sc.nextInt();
        // 부감독관은 한 방에서 감시할 수 있는 응시자의 수
        int C = sc.nextInt();
        // 각 방의 총감독관을 한명씩 배치
        long ans = r.length;
        for (int i = 0; i < r.length; i++) {
            r[i] -= B; // 총감독관이 감시할 수 있는 인원을 뻄
            if (r[i] > 0) { // 총감독관이 커버할 수 있는 인원보다 남으면 부감독관을 투입
                r[i]--;
                r[i] /= C;
                r[i]++;
                ans += r[i];
            }
        }
        System.out.println(ans);
    }

}
