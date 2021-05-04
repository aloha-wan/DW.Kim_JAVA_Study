package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 5.
 * 문제 제목 : 시험성적
 * 문제 번호 : 9498
 * 문제 출처 : https://www.acmicpc.net/problem/9498
 *
 * 문    제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 출    력 : 시험 성적을 출력한다.
 *
 *
 **/
public class Main_9498_시험성적 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        if(90 <= grade && grade <= 100){
            System.out.println("A");
        } else if(80 <= grade && grade < 90){
            System.out.println("B");
        } else if(70 <= grade && grade < 80){
            System.out.println("C");
        } else if(60 <= grade && grade < 70){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
