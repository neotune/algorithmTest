package com.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        /*
        배열에 같은 값이 있는지 체크해서 해당 배열 위치값을 던져 주는것으로 착각 할 수 있으나
        문제에 X+1 조건 때문에 순차적으로 위치값이 증가 해야 한다
        즉 1,2,3,4,5, 순으로 위치값이 진행되어야 한다
         */
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            // 배열의 원소에 최종 위치값 보다 작거나 같을 경우 입력
            // set을 사용 했으므로 중복값은 입력 되지 않음
            if (A[i] <= X) {
                result.add(A[i]);
            }

            // 최종 위치값까지 순서대로 저장 되었을 경우 set의 길이가 최종목적지 위치값과 같으므로
            // A의 배열의 위치값을 return
            if (result.size() == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(5,new int[] {1,3,1,4,2,3,5,4}));
    }
}
