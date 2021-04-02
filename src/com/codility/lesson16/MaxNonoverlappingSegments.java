package com.codility.lesson16;

public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        // 길이가 0일 경우 경우의 수가 없으므로 0
        if (A.length < 1 || B.length < 1) {
            return 0;
        }

        int count = 1;
        int end = B[0];

        for (int i = 0; i < A.length; i++) {
            // 시작점 만 비교
            if (A[i] > end) {
                count++;
                end = B[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MaxNonoverlappingSegments().solution(new int[] {1,3,7,9,9}, new int[] {5,6,8,9,10}));
    }
}
