package Materialization;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 4.
 * ���� ���� : A + B - 2
 * ���� ��ȣ : 2558
 * ���� ��ó : https://www.acmicpc.net/problem/2558
 *
 * ��    �� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� A, ��° �ٿ� B�� �־�����.(0 < A, B < 10)
 *
 * ��    �� : ù° �ٿ� A + B�� ����Ѵ�.
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
