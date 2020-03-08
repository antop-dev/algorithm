package kr.co.programmers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/17678
 */
public class P17678A {
    private final DateTimeFormatter dtf;

    public P17678A() {
        LocalDate today = LocalDate.now();
        dtf = new DateTimeFormatterBuilder().appendPattern("HH:mm")
                .parseDefaulting(ChronoField.YEAR, today.getYear())
                .parseDefaulting(ChronoField.MONTH_OF_YEAR, today.getMonthValue())
                .parseDefaulting(ChronoField.DAY_OF_MONTH, today.getDayOfMonth())
                .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
                .parseDefaulting(ChronoField.NANO_OF_SECOND, 0)
                .toFormatter();
    }

    public String solution(final int n, final int t, final int m, final String[] timetable) {
        // 대기열: String[] -> List<LocalDateTime>
        Queue<LocalDateTime> crews = Arrays.stream(timetable)
                .map(it -> LocalDateTime.parse(it, dtf))
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("crews = " + crews);

        // 09:00
        final LocalDateTime nine = LocalDateTime.parse("09:00", dtf);
        // make map
        TreeMap<LocalDateTime, LinkedList<LocalDateTime>> busTable = IntStream.range(0, n)
                .mapToObj(it -> nine.plusMinutes(it * t))
                .reduce(new TreeMap<>(), (map, time) -> {
                    LinkedList<LocalDateTime> list = new LinkedList<>();
                    LocalDateTime crew;
                    while ((crew = crews.peek()) != null) {
                        if (list.size() == m || crew.isAfter(time)) {
                            break;
                        }
                        list.add(crews.poll());
                    }

                    map.put(time, list);
                    return map;
                }, (x, y) -> x);

        System.out.println();
        for (Map.Entry<LocalDateTime, LinkedList<LocalDateTime>> e : busTable.entrySet()) {
            System.out.println(String.format("%s (%d) = %s", e.getKey().toLocalTime(), m, e.getValue()));
        }

        // 마지막 버스를 대상으로 콘의 도착 시간을 구한다.
        Map.Entry<LocalDateTime, LinkedList<LocalDateTime>> lastBus = busTable.lastEntry();
        LocalDateTime key = lastBus.getKey();
        LinkedList<LocalDateTime> queue = lastBus.getValue();

        LocalDateTime con = queue.size() < m ? key : queue.getLast().minusMinutes(1);

        System.out.println();
        System.out.println("con = " + con.toLocalTime());

        return con.format(dtf);
    }
}
