package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 16.
 * ���� ���� : ���� �� �����ϴ� �κ� ����
 * ���� ��ȣ : 11053
 * ���� ��ó : https://www.acmicpc.net/problem/
 * 
 * ��       �� : ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.
 *
 * ��       �� : ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
 *          ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
 *
 * ��       �� : ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
 *
 * 
 **/
public class Main_11053 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] d = new int[n];
        
        for (int i = 0; i < n; i++) {
            d[i] = 1;
            
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
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