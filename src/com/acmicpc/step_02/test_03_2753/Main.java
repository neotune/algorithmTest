package com.acmicpc.step_02.test_03_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        필요한 지식
        - / = 몪을 구함, % = 나머지를 구함
        - 특정 수를 % 하여 나머지가 0이면 해당 수의 배수라고 할 수 있음
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());


        if ((a % 4) == 0 && ((a % 100) != 0 || (a % 400) == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}