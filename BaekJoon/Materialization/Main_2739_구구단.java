package Materialization;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 4.
 * ���� ���� : ������
 * ���� ��ȣ : 2739
 * ���� ��ó : https://www.acmicpc.net/problem/2739
 *
 * ��    �� : N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 *
 * ��    �� : ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
 *
 * ��    �� : ������İ� ���� N*1���� N*9���� ����Ѵ�.
 *
 *
 **/
public class Main_2739_������ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i < 10; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
