package com.jungol.beginner;

import java.util.Scanner;

/*
문제
원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하는 프로그램을 작성하시오.

<처리조건>
(1) 구간의 처음과 끝을 입력받는다.
(2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다.
즉, 입력된 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다.

입력
구구단의 시작 범위 s와 끝 범위 e가 주어진다. (s와 e는 2부터 9사이의 정수)

출력
시작 범위와 끝 범위사이의 구구단을 출력하되 모든 값과 부호 사이는 공백으로 구분하여
아래 출력 예와 같이 줄을 맞추어 출력해야 한다.
식과 식 사이는 3개의 공백으로 구분하고 구구단 사이에는 한 줄을 비워 두도록 한다.

iunput sample
4 3

output sample
4 * 1 =  4   4 * 2 =  8   4 * 3 = 12
4 * 4 = 16   4 * 5 = 20   4 * 6 = 24
4 * 7 = 28   4 * 8 = 32   4 * 9 = 36

3 * 1 =  3   3 * 2 =  6   3 * 3 =  9
3 * 4 = 12   3 * 5 = 15   3 * 6 = 18
3 * 7 = 21   3 * 8 = 24   3 * 9 = 27
 */
public class GuGuDan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s, e;
        while (true) {
            s = sc.nextInt();
            e = sc.nextInt();
            if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9))
                break;
            else {
                System.out.println("INPUT ERROR!");
            }
        }

        if (s < e) {
            for (int j = s; j <= e; j++) {
                for (int i = 1; i <= 9; i++) {
                    System.out.printf("true %d * %d = %2d", j, i, j * i);
                    if ((i % 3) == 0) {
                        System.out.println();
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int j = s; j >= e; j--) {
                for (int i = 1; i <= 9; i++) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);
                    if ((i % 3) == 0) {
                        System.out.println();
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}