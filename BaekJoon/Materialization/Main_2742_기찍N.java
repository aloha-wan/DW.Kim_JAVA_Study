package Materialization;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 4.
 * ���� ���� : ����N
 * ���� ��ȣ : 2742
 * ���� ��ó : https://www.acmicpc.net/problem/2742
 *
 * ��    �� : �ڿ��� N�� �־����� ��, N���� 1���� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
 *
 * ��    �� : ù° �ٺ��� N��° �ٱ��� ó�ʴ�� ����Ѵ�.
 *
 *
 **/
public class Main_2742_����N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N; i > 0; i--){
            System.out.println(i);
        }
    }
}
