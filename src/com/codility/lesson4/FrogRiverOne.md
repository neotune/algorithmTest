##Task
A small frog wants to get to the other side of a river. <br>
작은 개구리가 강 건너편으로 건너고 싶어 합니다 <br>
The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). <br>
개구리의 강의 둑(위치값 : 0)에서 시작하여 반대쪽 둑(위치값 : X+1)으로 건너고 싶어 합니다 <br>
Leaves fall from a tree onto the surface of the river. <br>
나뭇잎은 나무에서 강 표면으로 떨어집니다 <br>

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds. <br>
낙엽을 나타내는 N개의 정수로 구성된 배열 A가 제공되며, A[K]는 초 단위로 측정된 시간 K에서 한잎이 떨어지는 위치를 나타냅니다 <br>

The goal is to find the earliest time when the frog can jump to the other side of the river. <br>
목표는 개구리가 강 반대편으로 점프 할 수 있는 가장 빠른 시간을 찾는 것입니다. <br>

The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). <br> 
개구리는 잎이 1에서 X까지 강 건너의 모든 위치에서 나타날때만 건널 수 있습니다 (1에서 X까지의 모든 위치가 잎으로 덮여 있는 가장 빠른 순간을 찾고 싶습니다) <br>

You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.<br>
강의 물 흐름 속도가 무시할 정도로 작다고 가정합니다 즉 잎이 강에 떨어지면 위치는 바뀌지 않습니다 <br>

For example, you are given integer X = 5 and array A such that: <br>
예를 들어 정수 X=5와 다음 배열이 주어집니다
```
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
```
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.다 <br>
5 위치로 가기 위해 가장 빠른 시간은 6초 입니다 <br>

Write a function:
``` java
class Solution { public int solution(int X, int[] A); }
```


that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
N개의 정수와 X로 구성된 비어 있지 않은 배열A가 주어지면 개구리가 강 반대편으로 점프 할 수 있는 가장 빠른 시간을 반환 해야 합니다
If the frog is never able to jump to the other side of the river, the function should return −1.
개구리가 강 반대편으로 점프를 할 수 없는 경우 함수는 -1을 반환 해야 합니다

For example, given X = 5 and array A such that:
예를 들어 정수 X=5와 다음 배열이 주어집니다

```
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
```

the function should return 6, as explained above.
함수는 위에서 설명 한대로 6을 반환 해야 합니다

Write an efficient algorithm for the following assumptions:
다음 가정에 대한 효율적인 알고리즘을 작성하시오

- N and X are integers within the range [1..100,000];
- N 과 X 정수의 범위는 1~ 100,000 까지다
- each element of array A is an integer within the range [1..X].
- 배열 A 구성요소는 1~ X까지다