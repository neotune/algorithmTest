package com.acmicpc.problem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, cnt = 1;
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Character> result = new ArrayList<Character>();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            while (cnt <= x) {
                stack.push(cnt);
                cnt += 1;
                result.add('+');
            }

            if (stack.peek() == x) {
                stack.pop();
                result.add('-');
            } else {
                System.out.println("NO");
            }
        }

        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }
    }
}
