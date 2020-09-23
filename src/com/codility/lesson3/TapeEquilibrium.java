package com.codility.lesson3;

public class TapeEquilibrium {
    public int solution(int[] A) {
        /*
        주어진 배열에서 각 구간 기준으로 좌 우로 나뉘어 좌측을 합친값 과 우측을 합친값의 차가 제일 작은 값을 구하는 문제
        ex) int[] A= {3, 1, 2, 4, 3};
            1번째 : 3 -(1+2+4+3) = 3 - 10 = 7
            2번째 : (3+1) - (2+4+3) = 4 - 9 = 5
            3번째 : (3+1+2) - (4+3) = 6 - 7 = 1
            4번째 : (3+1+2+4) - 3 = 10 - 3 = 7

         문제 풀이에 필요한 지식
         Integer.MAX_VALUE = java에서 int 최대값
         result에 int 최대값으로 초기화 한 이유는 0으로 초기화 할 경우 0 보다 작지 않으면 값이 입력되지 않음
         (for문에서 i=0 일때 result 변수에 값 입력하여 초기화 시킨 후 로직을 태우는 방법이 있긴 함)

         Math.abs() = 정수, 실수의 절대 값을 구하는 함수
         구간 기준 구간의차를 구할때 마이너스가 나올 수 있으므로 절대값으로 구간의 차 구함
        */

        // 구간 기준 왼쪽 총합
        int sumLeft = 0;
        // 배열의 총합
        int total = 0;
        // 구간의 차 최소값
        int result = Integer.MAX_VALUE;

        // 배열의 총합 계산
        for (int num : A) total += num;

        for (int i = 1; i < A.length; i++) {
            // for문 돌면서 구간 기준 왼쪽 합
            sumLeft += A[i-1];

            // for문 돌면서 총합에서 왼쪽 값 마이너스=오른쪽합
            total -= A[i-1];

            // 구간의 차 계산
            int diff = Math.abs(sumLeft - total);

            // 구간의 차가 작을 경우 입력
            if (result > diff) {
                result = diff;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{2,3,1,5}));
    }
}
