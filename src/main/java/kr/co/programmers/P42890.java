package kr.co.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42890
 */
public class P42890 {

    public int solution(final String[][] relation) {
        final List<String> superKeys = new ArrayList<>();

        for (int i = 0; i < relation[0].length; i++) {
            recurrence(superKeys, relation, "" + i);
        }

        superKeys.removeIf(key -> !isCandidateKey(superKeys, key));

        return superKeys.size();
    }

    /**
     * 재귀
     *
     * @param superKeys 저장할 슈퍼키 리스트
     * @param relation  데이터
     * @param columns   컬럼의 인덱스들
     */
    private void recurrence(final List<String> superKeys, final String[][] relation, String columns) {
        if (isSuperKey(relation, columns)) {
            superKeys.add(columns);
            // 현재 컬럼이 슈퍼키에 만족하면 이 이후의 슈퍼키들은 최소성을 만족하지 않게 된다.
            // 그러므로 더 깊이 들어갈 필요가 없다.
            // 이 부분을 풀면 풀 스캔!
            return;
        }

        int lastIndex = columns.charAt(columns.length() - 1) - 48;
        if (lastIndex < relation[0].length - 1) {
            for (int i = lastIndex + 1; i < relation[0].length; i++) {
                recurrence(superKeys, relation, columns + i);
            }
        }
    }

    /**
     * 해당 칼럼(인덱스)의 조합으로 슈퍼키가 될 수 있는지 여부를 판단한다.
     *
     * @param relation recurrence
     * @param columns  칼럼의 인덱스들
     * @return 슈퍼키 여부
     */
    private boolean isSuperKey(String[][] relation, String columns) {
        Set<String> set = new HashSet<>();
        for (String[] tuple : relation) {
            StringBuilder s = new StringBuilder();
            for (int idx : columns.toCharArray()) {
                s.append(tuple[idx - 48]);
            }
            set.add(s.toString());
        }
        return set.size() == relation.length;
    }

    /**
     * 해당 슈퍼키(key)가 전체 슈퍼키들(superKeys) 중에서 후보키가 될 수 있는지 판단한다.
     *
     * @param superKeys 전체 슈퍼키 리스트
     * @param key       필터링할 슈퍼키
     * @return 후보키 가능 여부
     */
    private boolean isCandidateKey(final List<String> superKeys, final String key) {
        for (String superKey : superKeys) {
            if (superKey.equals(key)) {
                continue;
            }

            char[] chars = superKey.toCharArray();
            int count = chars.length;
            for (char c1 : chars) {
                if (key.contains("" + c1)) {
                    count--;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }

}
