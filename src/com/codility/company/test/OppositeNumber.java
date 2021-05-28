package com.codility.company.test;

import java.util.Arrays;

/**
 Write a function solution, given an array A of N integers,
 return the largest integer K>0 such that both K and -K(the opposite number) exist in array A.
 If there is no such number the function should return 0.

 Example:
 1. Given A = [3,2,-2,5,-3], the function should return 3.
 2. Given A = [1,2,3,-4], the function should return zero.

 */
public class OppositeNumber {
    public int solution(int[] A) {
        Arrays.sort(A);

        // 0(n)
        for (int i = 0; i < A.length - 1; i++) {
            // 0(n)
            for(int j = 0; j < A.length -1; j++) {
                if (A[i] + A[j] == 0) {
                    return Math.abs(A[i]);
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new OppositeNumber().solution(new int[]{3, 2, -2, 5, 3}));
        System.out.println(new OppositeNumber().solution(new int[]{1, 1, 2, -1, 2, -1}));
        System.out.println(new OppositeNumber().solution(new int[]{1, 2, 3, -4,}));
    }
}
