package kr.co.programmers;

import java.util.*;

public class P43164 {

    public String[] solution(String[][] tickets) {
        // String[DEPARTURE][ARRIVAL] → Map<DEPARTURE, List<ARRIVAL>> 로 변경.
        Map<String, List<String>> reduce = Arrays.stream(tickets).reduce(new HashMap<>(), (map, ticket) -> {
            List<String> arrivals = map.getOrDefault(ticket[0], new ArrayList<>());
            arrivals.add(ticket[1]);
            map.put(ticket[0], arrivals);
            return map;
        }, (x, y) -> x);
        // 목적지들을 오름차순으로 정렬
        reduce.values().forEach(Collections::sort);

        for (Map.Entry<String, List<String>> e : reduce.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        Stack<String> stack = new Stack<>();
        dfs(tickets.length + 1, stack, reduce);

        System.out.println();
        System.out.println("stack = " + stack);

        return stack.toArray(new String[0]);
    }

    /**
     * DFS
     *
     * @param complete 완료되어야 할 여행 경로 수
     * @param stack    여행 경로를 담을 스택
     * @param data     출발 공항, 도착 공항 정보를 담고 있는 맵
     */
    private void dfs(int complete, Stack<String> stack, Map<String, List<String>> data) {
        // 재귀 시작
        dfs(complete, stack, data, "ICN");
    }

    /**
     * DFS
     *
     * @param complete  완료되어야 할 여행 경로 수
     * @param stack     여행 경로를 담을 스택
     * @param data      출발 공항, 도착 공항 정보를 담고 있는 맵
     * @param departure 출발 공항
     */
    private void dfs(int complete, Stack<String> stack, Map<String, List<String>> data, String departure) {
        // 스택에 여행 경로 추가
        stack.push(departure);
        // 다음 목적지들을 가져옴
        List<String> arrivals = data.getOrDefault(departure, new ArrayList<>());
        if (arrivals.isEmpty()) {
            System.out.println();
            System.out.println("      " + departure + " → no arrivals");
        }

        int i = 0;
        int loop = arrivals.size();
        while (i < loop) {
            System.out.println();
            System.out.println("[" + (i + 1) + "/" + loop + "] " + departure + " → ??? (arrivals = " + arrivals + ", stack = " + stack + ")");
            // 가장 앞에 있는 도착 공항을 빼옴
            String arrival = arrivals.remove(0);

            System.out.println("[" + (i + 1) + "/" + loop + "] " + departure + " → " + arrival + " (arrivals = " + arrivals + ", stack = " + stack + ")");
            // ㄱㄱ
            dfs(complete, stack, data, arrival);

            System.out.println();
            System.out.println("[END] " + departure + " → " + arrival + ", stack = " + stack + " (" + stack.size() + "/" + complete + ")");
            // 모든 도착지를 찍었을 때
            if (stack.size() < complete) { // 여행경로가 완성되지 않았을 경우
                System.out.println("  not completed.");
                // 이동했던 기록을 취소한다.
                stack.pop();
                // 여기가 중요!
                // 도착지의 마지막 순서로 넣어둔다.
                arrivals.add(arrival);

                System.out.println("  " + departure + " → " + arrival + " canceled. (arrivals = " + arrivals + ", stack = " + stack + ")");
            } else {
                return;
            }

            // 다음 도착지 갈 준비
            // 여기서 다음 도착지는 리스트의 가장 앞에 있는 도착지이다.
            i++;
        }
    } // dfs

}


