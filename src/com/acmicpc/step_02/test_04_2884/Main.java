package com.acmicpc.step_02.test_04_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {
            hour--;
            if (hour < 0) {
                hour = 23;
            }

            System.out.printf("%s %s", hour, 60 + (minute - 45));

        } else {
            System.out.printf("test %s %s", hour, minute - 45);
        }
    }
}