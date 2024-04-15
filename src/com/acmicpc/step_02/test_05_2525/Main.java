package com.acmicpc.step_02.test_05_2525;

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
        int time = Integer.parseInt(br.readLine());


        hour = hour + (time / 60);
        minute = minute + (time % 60);


        if (minute >= 60) {
            hour++;
            minute = minute - 60;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

        System.out.printf("%s %s", hour, minute);
    }
}