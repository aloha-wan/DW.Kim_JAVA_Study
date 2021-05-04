package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 4.
 * 문제 제목 : A + B - 3
 * 문제 번호 : 10950
 * 문제 출처 : https://www.acmicpc.net/problem/10950
 *
 * 문    제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *           각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출    력 : 각 테스트 케이스마다 A+B를 출력한다.
 *
 *
 **/
public class Main_10950_AB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int case_count = sc.nextInt();
        int [][]A = new int [case_count][2];
        int []B = new int [case_count];

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < B.length; i++) {
            B[i] = A[i][0] + A[i][1];
        }

        for(int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}
