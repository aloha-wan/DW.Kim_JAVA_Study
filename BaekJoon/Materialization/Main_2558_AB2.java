package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 4.
 * 문제 제목 : A + B - 2
 * 문제 번호 : 2558
 * 문제 출처 : https://www.acmicpc.net/problem/2558
 *
 * 문    제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 A, 둘째 줄에 B가 주어진다.(0 < A, B < 10)
 *
 * 출    력 : 첫째 줄에 A + B를 출력한다.
 *
 *
 **/
public class Main_2558_AB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
