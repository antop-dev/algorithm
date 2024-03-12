package kr.co.programmers;

import java.util.Arrays;

public class P49993 {
    public int solution(String skill, String[] skillTrees) {
        String regex = "[^" + skill + "]";
        return (int) Arrays.stream(skillTrees)
                .map(it -> it.replaceAll(regex, ""))
                .filter(skill::startsWith)
                .count();
    }
}
