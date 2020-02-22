package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42627
 */
public class P42627 {
    // job[0] = 실행 시점
    // job[1] = 실행 시간
    public int solution(int[][] jobs) {
        print(jobs);

        int answer = 0;
        int time = 0;

        int[] job;
        while ((job = next(jobs, time)) != null) {
            int ms = (job[0] < time ? time - job[0] : 0) + job[1];
            time += (job[0] > time ? job[0] - time : 0) + job[1];

            System.out.println("job = " + Arrays.toString(job) + " (" + ms + "ms)");

            answer += ms;
            job[0] = -1; // 완료 처리
        }
        return answer / jobs.length;
    }

    private int[] next(final int[][] jobs, final int time) {
        System.out.println();
        System.out.println("next(time = " + time + "ms)");
        print(jobs);

        // 현재 시간(time) 이전에 들어온 작업중 작업시간이 가장 빠른 작업을 구한다.
        // 현재 시간(time) 이후의 실행 시점(job[0])이 가장 빠른 작업 시간을 구한다.
        // 요청시간이 같은 작업이 여러개일 경우 작업시간이 가장 빠른 작업을 구한다.
        return Arrays.stream(jobs)
                .filter(it -> it[0] > -1)
                .min((x, y) -> {
                    if (x[0] < time && y[0] >= time) {
                        return -1;
                    }
                    if (x[0] >= time && y[0] < time) {
                        return 1;
                    }
                    if (x[0] < time && y[0] < time) {
                        return x[1] - y[1];
                    }
                    return x[0] != y[0] ? x[0] - y[0] : x[1] - y[1];
                })
                .orElse(null);
    }

    private void print(int[][] jobs) {
        // print
        System.out.print("jobs =");
        for (int[] job : jobs) {
            System.out.print(" " + Arrays.toString(job));
        }
        System.out.println();
    }

}
