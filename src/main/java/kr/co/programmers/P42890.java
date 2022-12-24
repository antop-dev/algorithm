package kr.co.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://github.com/antop-dev/algorithm/issues/25
public class P42890 {

    public int solution(final String[][] relation) {
        final List<String> superKeys = new ArrayList<>();
        int columnSize = relation[0].length;
        for (int i = 0; i < columnSize; i++) {
            recurrence(superKeys, relation, "" + i);
        }
        // 슈퍼키들 중에 후보키가 될 수 없는 슈퍼키를 제거한다.
        superKeys.removeIf(key -> isNotCandidateKey(superKeys, key));

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

        int lastIndex = columns.charAt(columns.length() - 1) - '0';
        if (lastIndex < relation[0].length - 1) {
            for (int i = lastIndex + 1; i < relation[0].length; i++) {
                recurrence(superKeys, relation, columns + i);
            }
        }
    }

    /**
     * 해당 칼럼(인덱스)의 조합으로 슈퍼키가 될 수 있는지 여부를 판단한다.
     *
     * @param relation 전체 데이터
     * @param columns  칼럼의 인덱스들
     * @return 슈퍼키가 될 수 있는지
     */
    private boolean isSuperKey(String[][] relation, String columns) {
        Set<String> set = new HashSet<>();
        for (String[] tuple : relation) {
            StringBuilder data = new StringBuilder();
            for (char ch : columns.toCharArray()) {
                data.append(tuple[ch - '0']);
            }
            if (!set.add(data.toString())) {
                return false;
            }
        }
        return true;
    }

    /**
     * 최소성 검사<br>
     * 주어진 슈퍼키(key)가 전체 슈퍼키 중에 후보키가 될 수 없는지 판단
     *
     * @param superKeys 전체 슈퍼키 리스트
     * @param key       따져볼 슈퍼키
     * @return 후보키 불가능 여부
     */
    private boolean isNotCandidateKey(final List<String> superKeys, final String key) {
        for (String superKey : superKeys) {
            if (superKey.equals(key)) {
                continue;
            }

            int count = superKey.length();
            for (int i = 0; i < superKey.length(); i++) {
                if (key.indexOf(superKey.charAt(i)) > -1) {
                    count--;
                }
            }

            if (count <= 0) {
                return true;
            }
        }
        return false;
    }

}
