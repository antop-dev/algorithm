package kr.co.programmers;

import java.util.ArrayList;
import java.util.List;

// https://github.com/antop-dev/algorithm/issues/592
public class P17677 {

    public int solution(String str1, String str2) {
        int m = 65536;

        var a = multiset(str1);
        var b = multiset(str2);
        if (a.isEmpty() && b.isEmpty()) { // 둘 다 공집합
            return m;
        }

        var intersection = intersection(a, b);
        var union = union(a, b, intersection);

        var js = (double) intersection / union;
        return (int) (js * m);
    }

    // 교집합 개수 구하기
    private int intersection(List<String> a, List<String> b) {
        var count = 0;
        for (var s : a) {
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i).equals(s)) {
                    count++;
                    b.set(i, "");
                    break;
                }
            }
        }
        return count;
    }

    // 합집합 개수 구하기
    private int union(List<String> a, List<String> b, int intersection) {
        return a.size() + b.size() - intersection;
    }

    // 다중집합 만들기
    private List<String> multiset(String s) {
        var multiset = new ArrayList<String>();
        for (int i = 1; i < s.length(); i++) {
            var x = s.charAt(i - 1);
            var y = s.charAt(i);
            if (isAlphabet(x, y)) {
                multiset.add(toUpper(x) + "" + toUpper(y));
            }
        }
        return multiset;
    }

    private boolean isAlphabet(char... chars) {
        for (char ch : chars) {
            if (!isAlphabet(ch)) {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphabet(char ch) {
        return (65 <= ch && ch <= 90) || (97 <= ch && ch <= 122);
    }

    private char toUpper(char ch) {
        return (97 <= ch && ch <= 122) ? (char) (ch - 32) : ch;
    }

}
