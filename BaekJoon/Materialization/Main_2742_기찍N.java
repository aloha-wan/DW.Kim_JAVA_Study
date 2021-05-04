package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 4.
 * 문제 제목 : 기찍N
 * 문제 번호 : 2742
 * 문제 출처 : https://www.acmicpc.net/problem/2742
 *
 * 문    제 : 자연수 N이 주어졌을 때, N부터 1까지 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출    력 : 첫째 줄부터 N번째 줄까지 처례대로 출력한다.
 *
 *
 **/
public class Main_2742_기찍N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N; i > 0; i--){
            System.out.println(i);
        }
    }
}
