package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 2.
 * ���� ���� : ������ 2
 * ���� ��ȣ : 13398
 * ���� ��ó : https://www.acmicpc.net/problem/
 * 
 * ��       �� : n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���� �� �� �̻� �����ؾ� �Ѵ�. ��, �������� ���� �ϳ� ������ �� �ִ�. (�������� �ʾƵ� �ȴ�)
 *         ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ���� �������� �ʾ��� ���� ������ 12+21�� 33�� ������ �ȴ�.
 *         ����, -35�� �����Ѵٸ�, ������ 10, -4, 3, 1, 5, 6, 12, 21, -1�� �ǰ�, ���⼭ ������ 10-4+3+1+5+6+12+21�� 54�� �ȴ�.
 *
 * ��       �� : ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����. ���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
 *
 * ��       �� : ù° �ٿ� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_13398 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] d = new int[n];
        int[] dr = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
            if (i > 0 && d[i] < d[i-1] + a[i]) {
                d[i] = d[i-1] + a[i];
            }
        }
        
        for (int i = n-1; i >= 0; i--) {
            dr[i] = a[i];
            if (i < n-1 && dr[i] < dr[i+1] + a[i]) {
                dr[i] = dr[i+1] + a[i];
            }
        
        }
        
        int ans = d[0];
        
        for (int i = 1; i < n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        
        for (int i=1; i<n-1; i++) {
            if (ans < d[i-1] + dr[i+1]) {
                ans = d[i-1] + dr[i+1];
            }
        }
        
        System.out.println(ans);
    }
}
