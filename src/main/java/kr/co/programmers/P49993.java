package kr.co.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class P49993 {
    public int solution(String skill, String[] skillTrees) {
        int ans = 0;
        for (String skillTree : skillTrees) {
            if (check(skillTree, skill)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean check(String skillTree, String skill) {
        Queue<Character> queue = new LinkedList<>();
        for (char ch : skill.toCharArray()) {
            queue.offer(ch);
        }
        for (char ch : skillTree.toCharArray()) {
            if (!queue.contains(ch)) {
                continue;
            }
            if (queue.poll() != ch) {
                return false;
            }
        }
        return true;
    }
}
