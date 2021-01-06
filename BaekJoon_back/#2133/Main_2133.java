package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 4.
 * ���� ���� : Ÿ�� ä���
 * ���� ��ȣ : 2133
 * ���� ��ó : https://www.acmicpc.net/problem/2133
 * 
 * ��       �� : 3��N ũ���� ���� 2��1, 1��2 ũ���� Ÿ�Ϸ� ä��� ����� ���� ���غ���.
 *
 * ��       �� : ù° �ٿ� N(1 �� N �� 30)�� �־�����.
 *
 * ��       �� : ù° �ٿ� ����� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_2133 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n+1];
        
        d[0] = 1;
        
        for (int i = 2; i <= n; i += 2) {
            d[i] = d[i-2]*3;
            for (int j = i-4; j >= 0; j -= 2) {
                d[i] += d[j]*2;
            }
        }
        
        System.out.println(d[n]);
    }
}
