package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 4.
 * 문제 제목 : 구구단
 * 문제 번호 : 2739
 * 문제 출처 : https://www.acmicpc.net/problem/2739
 *
 * 문    제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 *
 * 입    력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 *
 * 출    력 : 출력형식과 같게 N*1부터 N*9까지 출력한다.
 *
 *
 **/
public class Main_2739_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
