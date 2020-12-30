package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 30.
 * ���� ���� : ���� ū ���� �κ� ����
 * ���� ��ȣ : 11055
 * ���� ��ó : https://www.acmicpc.net/problem/
 * 
 * ��       �� : ���� A�� �־����� ��, �� ������ ���� �κ� ���� �߿��� ���� ���� ū ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ���� ���, ���� A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} �� ��쿡 ���� ���� ū ���� �κ� ������ A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} �̰�, ���� 113�̴�.
 *
 * ��       �� : ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
 *         ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
 *
 * ��       �� : ù° �ٿ� ���� A�� ���� ���� ū ���� �κ� ������ ���� ����Ѵ�.
 *
 * 
 **/
public class Main_11055 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] d = new int[n];
        
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+a[i]) {
                    d[i] = d[j]+a[i];
                }
            }
        }
        
        int ans = d[0];
        
        for (int i = 0; i < n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        
        System.out.println(ans);
    }
}
