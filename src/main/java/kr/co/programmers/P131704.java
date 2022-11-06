package kr.co.programmers;

import java.util.Stack;

public class P131704 {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int i = 0;
        int box = 0;

        while (box < order.length) {
            box++; // n번 택배상자

            if (box == order[i]) { // 택배상자를 트럭에 실을 수 있으면 바로 싣는다.
                count++;
                i++;
            } else { // 안되면 보조 컨테이너 벨트에 보관
                stack.push(box);
            }
            // 보조 건테이너에서 꺼낼 수 있는 만큼 꺼낸다.
            while (!stack.empty() && stack.peek() == order[i]) {
                stack.pop();
                i++;
                count++;
            }

        }

        return count;
    }
}
