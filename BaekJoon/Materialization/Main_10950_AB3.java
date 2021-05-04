package Materialization;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 4.
 * ���� ���� : A + B - 3
 * ���� ��ȣ : 10950
 * ���� ��ó : https://www.acmicpc.net/problem/10950
 *
 * ��    �� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 *           �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 *
 * ��    �� : �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
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
