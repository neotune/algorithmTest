package com.codility.company.test;

import java.util.ArrayList;
import java.util.List;

/**
 https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/

 Given the following details of a matrix with n columns and 2 rows :
 The matrix is a binary matrix, which means each element in the matrix can be 0 or 1.
 The sum of elements of the 0-th(upper) row is given as upper.
 The sum of elements of the 1-st(lower) row is given as lower.
 The sum of elements in the i-th column(0-indexed) is colsum[i], where colsum is given as an integer array with length n.
 Your task is to reconstruct the matrix with upper, lower and colsum.
 Return it as a 2-D integer array.
 If there are more than one valid solution, any of them will be accepted.
 If no valid solution exists, return an empty 2-D array.

 Example 1:
 Input: upper = 2, lower = 1, colsum = [1,1,1]
 Output: [[1,1,0],[0,0,1]]
 Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.
 Example 2:
 Input: upper = 2, lower = 3, colsum = [2,2,1,1]
 Output: []
 Example 3:
 Input: upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
 Output: [[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]
 */
public class RowBinaryMatrix {
    public String solution(int U, int L, int[] C) {
        List<String> upper = new ArrayList<>();
        List<String> lower = new ArrayList<>();


        int diff = U - L;
        int sum = 0;

        for (int i : C) {
            sum += i;
            if (i % 2 == 0) {
                // 0 or 2
//                System.out.println(i / 2);
                upper.add(String.valueOf(i / 2));
                lower.add(String.valueOf(i / 2));
            } else {
                // 1
                if (diff > 0) {
                    upper.add("1");
                    lower.add("0");
                    diff--;
                } else {
                    upper.add("0");
                    lower.add("1");
                    diff++;
                }
            }
        }
        if (diff != 0 || U + L != sum) {
            return "IMPOSSIBLE";
        }

        List<String> result = new ArrayList<>();
        result.addAll(upper);
        result.add(",");
        result.addAll(lower);

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < result.size(); j++) {
            sb.append(result.get(j));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RowBinaryMatrix().solution(3, 2, new int[]{2, 1, 1, 0, 1}));
        System.out.println(new RowBinaryMatrix().solution(2, 3, new int[]{0, 0, 1, 1, 2}));
        System.out.println(new RowBinaryMatrix().solution(2, 2, new int[]{2, 0, 2, 0}));

    }
}
