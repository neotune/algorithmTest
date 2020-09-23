package com.codility.lesson3;

public class PermMissingElem {
    public int solution(int[] A) {
        // 배열 길이 계산
        int length = A.length + 1;

        // 배열길이에 따라 들어갈 수 있는 전체 숫자의 합 계산
        int total = length * (length + 1) / 2;

        for (int num : A) {
            // 전체 합에서 배열에 있는 숫자를 제외 하면 없는 숫자 도출
            total -= num;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2,3,1,5}));
    }
}
