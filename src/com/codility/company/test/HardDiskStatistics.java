package com.codility.company.test;

import java.math.BigInteger;
import java.util.*;

/**


 */
public class HardDiskStatistics {
    public String solution(String S) {
        if (S != null && S.trim().length() > 1) {
            Set<String> music = new HashSet<>(Arrays.asList("mp3", "aac", "flac"));
            Set<String> images = new HashSet<>(Arrays.asList("jpg", "bmp", "gif"));
            Set<String> movies = new HashSet<>(Arrays.asList("mp4", "avi", "mkv"));

            Map<String, BigInteger> files = new HashMap<String, BigInteger>() {{
                put("music", new BigInteger("0"));
                put("images", new BigInteger("0"));
                put("movies", new BigInteger("0"));
                put("other", new BigInteger("0"));
            }};

            String[] line = S.split("[\\n]");

            for (int i = 0; i < line.length; i++) {

                // ex)"my.song.mp3 11b" = {"mp3", "11b"}
                String[] str = line[i].substring(line[i].lastIndexOf("."), line[i].length()-1).split("\\s+");

                if (music.contains(str[0])) {
                    files.put("music", files.get("music").add(new BigInteger(str[1])));
                } else if (images.contains(str[0])) {
                    files.put("images", files.get("images").add(new BigInteger(str[1])));
                } else if (movies.contains(str[0])) {
                    files.put("movies", files.get("movies").add(new BigInteger(str[1])));
                } else {
                    files.put("other", files.get("other").add(new BigInteger(str[1])));
                }
            }

            StringBuilder builder = new StringBuilder();
            for (Map.Entry<String, BigInteger> map : files.entrySet()) {
                builder.append(map.getKey() + " " + map.getValue() + "b\\n");
            }

            return builder.toString();
        }

        return null;
    }

    public static void main(String[] args) {
        String S = "my.song.mp3 11b\n" + "greatSong.flac 1000b\n"
                + "not3.txt 5b\n" + "video.mp4 200b\n" + "game.exe 100b\n"
                + "mov!e.mkv 10000b";

        System.out.println(new HardDiskStatistics().solution(S));
    }
}
