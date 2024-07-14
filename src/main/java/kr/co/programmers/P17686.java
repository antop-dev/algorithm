package kr.co.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// // https://github.com/antop-dev/algorithm/issues/568
public class P17686 {
    public String[] solution(String[] files) {
        var pattern = Pattern.compile("^([a-zA-Z\\-\\s]+)([0-9]{1,5})(.*)$");
        return Arrays.stream(files)
                // 정규식 추출
                .map(pattern::matcher)
                .filter(Matcher::find)
                // 정렬
                .sorted(Comparator
                        .comparing((Matcher m) -> m.group(1).toLowerCase())
                        .thenComparingInt(m -> Integer.parseInt(m.group(2)))
                )
                // 원래 파일명으로 변환
                .map(m -> m.group(0))
                // String[]으로 변환
                .toArray(String[]::new);
    }
}
