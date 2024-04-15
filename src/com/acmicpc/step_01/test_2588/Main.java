package com.acmicpc.step_01.test_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        /*
        / = 몫을 사용, % = 나머지를 사용
        10, 100 과 /, % 을 사용하여 자리수 별로 숫자를 split 한 효과를 낼 수 있음

        1의 자리를 구하는 방법
        - 385 % 10 -> 몫 38 나머지 5 -> 나머지 5 사용

        10의 자리를 구하는 방법
        - 385 % 100 -> 몫 3 나머지 85 -> 나머지 85 사용 -> 85 / 10 -> 몫 8 나머지 5 -> 몫 8 사용

        100의 자리를 구하는 방법
        - 385 / 100 -> 몫 3 나머지 85 -> 몫 3 사용
         */

        // 472 * 385 -> 472 * 5
        System.out.println(a * (b % 10));

        // 472 * 385 -> 472 * 8
        System.out.println(a * (b % 100 / 10));

        // 472 * 385 -> 472 * 3
        System.out.println(a * (b / 100));

        // 472 * 385
        System.out.println(a * b);
    }
}