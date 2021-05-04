package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 4.
 * 문제 제목 : 세수
 * 문제 번호 : 10817
 * 문제 출처 : https://www.acmicpc.net/problem/10817
 *
 * 문    제 : 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 <= A, B, C <= 100)
 *
 * 출    력 : 두 번째로 큰 정수를 출력한다.
 *
 *
 **/
public class Main_10817_세수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // A가 가장 클 때
        if(B <= A && C <= A){
            if(B <= C){
                System.out.println(C);
            } else if(C <= B){
                System.out.println(B);
            }
        // B가 가장 클 때
        } else if(A <= B && C <= B){
            if(A <= C){
                System.out.println(C);
            } else if(C <= A){
                System.out.println(A);
            }
        // C가 가장 클 때
        } else if(A <= C && B <= C){
            if(A <= B) {
                System.out.println(B);
            } else if(B <= A) {
                System.out.println(A);
            }
        }
    }
}
