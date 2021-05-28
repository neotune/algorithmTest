package com.codility.company.test;

import java.util.Arrays;

/**
 Common-minimum problem:
 Write a function:
 int solution(int A[], int B[]);

 that, given a non-empty zero-indexed array A of N non-negative integers and
 a non-empty zero-indexed array B of M non-negative integers,
 returns the minimal value that occurs in both arrays.
 If there is no such value, the function should return -1.
 */
public class CommonMinimum {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                return A[i];
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new CommonMinimum().solution(new int[]{1, 3, 2, 1}, new int[]{4, 2, 5, 3, 2}));
        System.out.println(new CommonMinimum().solution(new int[]{2, 1}, new int[]{3, 3}));
    }
}
