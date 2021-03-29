package com.acmicpc.problem;

import java.util.Scanner;

public class Test2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] result = new int[8];
        boolean ascending = true;
        boolean descending = true;

        // scanner 입력
        for (int i = 0; i < 8; i++) {
            result[i] = sc.nextInt();
        }

        for (int j = 1; j < 8; j++) {
            if (result[j] > result[j - 1]) {
                // 뒷 숫자가 앞 숫자보다 클 경우 descending false
                descending = false;
            }

            if (result[j] < result[j - 1]) {
                // 뒷 숫자가 앞 숫자보다 작을 경우 ascending false
                ascending = false;
            }
        }
        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("decending");
        } else {
            System.out.println("mixed");
        }
    }
}
