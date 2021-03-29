package com.acmicpc.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Test2978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        int[] data = new int[100];
        int result = 0;

        //숫자 갯수
        n = sc.nextInt();
        // 맥시멈 값
        m = sc.nextInt();

        // 숫자 카드
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);

        for (int j = 0; j < n; j++) {
            result += data[j];
             if (result > m) {
                System.out.println(result - data[j]);
                break;
            }

            if (result == m) {
                System.out.println(result);
                break;
            }

        }


    }
}
