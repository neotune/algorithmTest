package com.codility.lesson4;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];

        // 현재 배열안 MAX 값
        int currentMaxNumInArray = 0;

        // 마지막에 갱신된 MAX값
        int lastRecordMaxNum = 0;
        for (int i = 0; i < A.length; i++) {
            // 결과 배열의 위치 값
            int arrPosition = A[i];

            if (arrPosition > N) {
                // N 보다 주소값이 클 경우 배열안에 있는 숫자 중 제일 큰 숫자 기록
                lastRecordMaxNum = currentMaxNumInArray;
            } else {
                if (result[arrPosition - 1] < lastRecordMaxNum) {
                    /*
                     주소 값에 있는 count 숫자가 배열중 가장 큰 숫자 보다 작을 경우 최소값 보존을 위해 기록용 맥스+1 입력
                     마지막에 기록된 최대값에 +1 하는 이유는 최대값보다 작다는건 이미 전체 배열에 최대값이 입력되어야 하는데
                     해당 과정을 생략 했기 때문
                     */

                    result[arrPosition - 1] = lastRecordMaxNum + 1;
                } else {
                    // 주소값에 +1 입력
                    result[arrPosition - 1]++;
                }

                // 주소값에 입력된 값이 배열 안에 있는 큰 값보다 클 경우 배열안에 있는 큰 값 갱신
                if (result[arrPosition - 1] > currentMaxNumInArray) {
                    currentMaxNumInArray = result[arrPosition - 1];
                }
            }
        }

        // lastMax 값 보다 다 작을 경우 lastMax 값으로 전부다 갱신
        for (int j = 0; j < N; j++) {
            if(result[j] < lastRecordMaxNum) {
                result[j] = lastRecordMaxNum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MaxCounters().solution(5,new int[] {3, 4, 4, 6, 1, 4, 4}));
    }
}
