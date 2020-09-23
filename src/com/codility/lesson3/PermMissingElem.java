package com.codility.lesson3;

public class PermMissingElem {
    public int solution(int[] A) {
        /*
        문제에서 주어질 수 있는 숫자의 길이가 0~100,000 자리 까지 이므로
        1부터 n까지 합 공식(n(n+1)/2)에 의해 나올 숫자가 int 자리 수 이상으로 나올 수 있으므로
        long 으로 계산 후 없는 숫자 도출시 int으로 변환 해서 return

        int 범위 -2,147,483,648 ~ 2,147,483,647
        공식(n(n+1)/2) 으로 나올 수 있는 최대값 5,000,050,000
         */

        // 배열 길이 계산
        long length = A.length + 1;

        // 배열길이에 따라 들어갈 수 있는 전체 숫자의 합 계산
        long total = length * (length + 1) / 2;

        for (int num : A) {
            // 전체 합에서 배열에 있는 숫자를 제외 하면 없는 숫자 도출
            total -= num;
        }

        return (int)total;
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2,3,1,5}));
    }
}
