##Task
Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter.<br>
인스턴스변수 age 와 initalAge를 매개변수로 사용하는 생성자를 사용하여 Person 클래스를 작성하시오

The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative;<br>
생성자는 initialAge가 음수가 아니므로 전달 된 인수를 확인 한 후에 age에 initalAge 값을 할당해야 한다

if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0. In addition, you must write the following instance methods:<br>
initialAge 값이 음수 일 경우 생성자에서 age를 0으로 설정하고 "Age is not valid, setting age to 0." 문구를 출력해야 합니다 아래와 같이 함수를 작성 해야 합니다


1. yearPasses() should increases the age instance variable by 1.
2. amIOld() should perform the following conditional actions:
    - If age<13, print You are young.You are young.
    - If age≥13 and age<18, print You are a teenager.
    - Otherwise, print You are old.


1. yearPasses() 함수는 age 변수를 1씩 늘려야 한다
2. amIOld() 함수는 아래와 같은 조건으로 작동해야 합니다
    - 만약 age<13 일 경우 "You are young.You are young." 출력
    - 만약 age≥13 이고nd age<18 일 경우 "You are a teenager." 출력
    - 그외의 경우 "You are old." 출력

    
##Sample Input
 ```
  4
  -1
  10
  16
  18
 ```
 
 ##Sample Output
 ```
 Age is not valid, setting age to 0.
 You are young.
 You are young.
 
 You are young.
 You are a teenager.
 
 You are a teenager.
 You are old.
 
 You are old.
 You are old.
 ```
 
### Explanation
 
 Test Case 0: initialAge=−1
 Because initialAge<0, our code must set age to 00 and print the “Age is not valid…” message followed by the young message. Three years pass and age=3, so we print the young message again.
 
 Test Case 1: initialAge=10
 Because initialAge<13, our code should print that the person is young. Three years pass and age=13, so we print that the person is now a teenager.
 
 Test Case 2: initialAge=16
 Because 13≤initialAge<18, our code should print that the person is a teenager. Three years pass and age=19, so we print that the person is old.
 
 Test Case 3: initialAge=18
 Because initialAge≥18, our code should print that the person is old. Three years pass and the person is still old at age=21, so we print the old message again.