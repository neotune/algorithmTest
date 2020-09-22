package com.codility.lesson3;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // 뛰어야 하는 거리 계산
        int dist = Y - X;

        // 점프 횟수 계산
        int count = dist / D;

        if (dist % D > 0) {
            // 점프 횟수 계산 시 나머지 가 있을 경우 count 1 증가
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30));
    }
}
