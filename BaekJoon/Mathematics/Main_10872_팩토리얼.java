package Mathematics;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 6.
 * 문제 제목 : 팩토리얼
 * 문제 번호 : 10872
 * 문제 출처 : https://www.acmicpc.net/problem/10872
 *
 * 문    제 : 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 정수 N(0 <= N <= 12)가 주어진다.
 *
 * 출    력 : 첫째 줄에 N!을 출력한다.
 *
 *
 **/
public class Main_10872_팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;

        for(int i = N; i > 0; i--){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
