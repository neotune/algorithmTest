package com.programmers.lessons.hash.malatoneo;

import java.util.HashMap;

public class Malatoneo2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> counts = new HashMap<>();

        for (String c : completion) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (String p : participant) {
            if (!counts.containsKey(p) || counts.get(p) == 0) {
                answer = p;
                break;
            } else {
                counts.computeIfPresent(p, (String key, Integer value) -> --value);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Malatoneo2().solution(new String[] {"mislav", "stanko", "mislav", "ana"} , new String[] {"stanko", "ana", "mislav"}));
    }
}
