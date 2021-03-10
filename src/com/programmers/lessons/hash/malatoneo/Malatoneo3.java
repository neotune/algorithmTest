package com.programmers.lessons.hash.malatoneo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Malatoneo3 {
    public String solution(String[] participant, String[] completion) {
        // 마라토너 중복 체크, 중복일 경우 counting
        Map<String, Long> participantMap = Arrays.asList(participant).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String name : completion) {
            //꺼낸 횟수 기록을 위해 -1
            Long value = participantMap.get(name) - 1L;

            if(value == 0L) {
                // 0일 경우 중복이 없으므로 hash map 에서 삭제
                participantMap.remove(name);
            } else {
                // 중복이거나 완주하지 못한 마라토너 이므로 최신 value로 마라토너 입력
                participantMap.put(name, value);
            }
        }

        // 중복 체크 및 완주자 목록 체크 완료 후 1명만 남으므로 return
        return participantMap.keySet().iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(new Malatoneo3().solution(new String[] {"mislav", "stanko", "mislav", "ana"} , new String[] {"stanko", "ana", "mislav"}));
    }
}
