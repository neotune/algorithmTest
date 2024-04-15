package com.acmicpc.step_02.test_06_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        List<Integer> numList = Collections.list(st).stream().map(number -> Integer.parseInt((String) number)).collect(Collectors.toList());
        Set<Integer> numSet = new HashSet<>(numList);

        if (numSet.size() == 1) {
            System.out.printf("%s", 10000 + (numList.get(0) * 1000));
        } else if (numSet.size() == 2) {
            for (Integer integer : numSet) {
                numList.remove(integer);
            }
            System.out.printf("%s", 1000 + (numList.get(0) * 100));
        } else {
            numList.sort(Collections.reverseOrder());
            System.out.printf("%s", numList.get(0) * 100);
        }
    }
}