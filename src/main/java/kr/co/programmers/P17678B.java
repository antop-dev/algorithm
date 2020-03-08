package kr.co.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17678
 */
public class P17678B {

    public String solution(final int n, final int t, final int m, final String[] timetable) {
        // 대기열: String[] -> List<int>
        Queue<Integer> crews = Arrays.stream(timetable)
                .map(this::convert)
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("crews = " + Arrays.toString(timetable));

        int nine = 540; // 09:00
        int con = -1; // 콘의 도착 시간

        for (int i = 0; i < n; i++) {
            int bus = nine + (i * t);

            System.out.println();
            System.out.println("bus = " + convert(bus) + " (" + m + ")");

            int lastCrew = 0; // 마지막 승객을 기억하고 있는다.
            int c = 0; // 현재 버스의 탑승 인원
            while (c < m) {
                Integer crew = crews.peek();
                if (crew == null || crew > bus) {
                    break;
                }
                lastCrew = crews.poll();
                c++;

                System.out.println("  crew = " + convert(crew));
            }

            // 마지막 버스일 때
            if (i + 1 == n) {
                // 마지막 버스에 전부 탑승 했을 경우 마지막 승객보다 1분 먼저 와야 한다.
                // 마지막 버스에 인원이 남으면 버스의 도착 시간에 오면 된다.
                con = (c == m) ? lastCrew - 1 : bus;
            }
        }

        System.out.println();
        System.out.println("con = " + convert(con));

        return convert(con);
    }

    private int convert(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3));
        return (h * 60) + m;
    }

    private String convert(int minutes) {
        return String.format("%02d:%02d", minutes / 60, minutes % 60);
    }
}