package com.jungol.beginner;

import java.util.Scanner;

/*
[문제]
사각형의 높이 n과 너비 m을 입력받은 후
n행 m열의 사각형 형태로 1부터 n*m번까지 숫자가 차례대로 출력되는 프로그램을 작성하시오.

< 처리조건 > 
숫자의 진행 순서는 처음에 맨 윗줄의 왼쪽에서 오른쪽으로 1부터 차례대로 너비 m만큼 출력한 후 
다음 줄로 바꾸어서 다시 왼쪽에서 오른쪽으로 1씩 증가하면서 출력하는 방법으로 n번 줄까지 반복한다.

[입력]
사각형의 높이n와 너비m( n과 m의 범위는 100 이하의 정수)이 주어진다.

[출력]
위에서 형태의 직사각형을 입력에서 들어온 높이 n과 너비 m에 맞춰서 출력한다. 숫자 사이는 공백으로 구분한다.

[iunput sample]
4 5

[output sample]
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
 */
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            if ((n >= 1 && n <= 100) && (m >= 1 && m <= 100)) {
                break;
            } else {
                System.out.println("INPUT ERROR!");
            }
        }

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%d", num);
                num++;
                if (j == m) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}