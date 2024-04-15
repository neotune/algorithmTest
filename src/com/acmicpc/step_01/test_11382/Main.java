package com.acmicpc.step_01.test_11382;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());

        /*
        "첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다."
        위 조건에 10에 12승 이라는 조건 때문에 변수 타입을 int 에서 Long으로 변경 해야 한다
        int - 최대 10의 9승까지 표현
        Long - 최대 10의 18승 까지 표현
         */
        System.out.println(a + b + c);
    }
}