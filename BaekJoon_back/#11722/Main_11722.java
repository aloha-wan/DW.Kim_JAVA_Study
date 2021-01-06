package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 31.
 * ���� ���� : ���� �� �����ϴ� �κ� ����
 * ���� ��ȣ : 11722
 * ���� ��ó : https://www.acmicpc.net/problem/
 * 
 * ��       �� : ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *         ���� ���, ���� A = {10, 30, 10, 20, 20, 10} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 30, 10, 20, 20, 10}  �̰�, ���̴� 3�̴�.
 *
 * ��       �� : ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
 *         ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
 *
 * ��       �� : ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
 *
 * 
 **/
public class Main_11722 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] d = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 1; i <= n; i++) {
            d[i] = 1;
            for (int j = 1; j <= i; j++) {
                if (a[j] > a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                }
            }
        }
        
        int ans = d[1];
        for (int i = 2; i <= n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        
        System.out.println(ans);
    }
}
