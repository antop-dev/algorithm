package kr.co.programmers;

import java.util.ArrayList;
import java.util.List;

// https://github.com/antop-dev/algorithm/issues/433
public class P17683 {

    public String solution(String m, String[] musicinfos) {
        List<String[]> musics = new ArrayList<>();
        for (String info : musicinfos) {
            String[] split = info.split(",");
            String name = split[2]; // 음악 제목
            String sheet = sheet(split[0], split[1], split[3]);
            musics.add(new String[] {name, sheet});
        }

        musics.sort((o1, o2) -> o2[1].length() - o1[1].length());

        String x = replace(m);
        for (String[] music : musics) {
            if (music[1].contains(x)) {
                return music[0];
            }
        }
        return "(None)";
    }

    private String sheet(String start, String end, String music) {
        StringBuilder sb = new StringBuilder();

        String r = replace(music);
        int length = minute(end) - minute(start);

        while (sb.length() < length) {
            sb.append(r);
        }
        return sb.substring(0, length);
    }

    private int minute(String time) {
        String[] split = time.split(":");
        return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
    }

    private String replace(String s) {
        // C, C#, D, D#, E, F, F#, G, G#, A, A#, B
        // C,  1, D   2, E, F,  3, G,  4, A   5, B
        return s.replaceAll("C#", "1")
                .replace("D#", "2")
                .replace("F#", "3")
                .replace("G#", "4")
                .replace("A#", "5");
    }

}
