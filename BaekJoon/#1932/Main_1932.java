package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 28.
 * ���� ���� : ���� �ﰢ��
 * ���� ��ȣ : 1932
 * ���� ��ó : https://www.acmicpc.net/problem/1932
 * 
 * ��       �� :           7
 *                 3   8
 *               8   1   0
 *             2   7   4   4
 *           4   5   2   6   5
 *         �� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
 *         �� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�. 
 *         �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
 *         �ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.
 *
 * ��       �� : ù° �ٿ� �ﰢ���� ũ�� n(1 �� n �� 500)�� �־�����, ��° �ٺ��� n+1��° �ٱ��� ���� �ﰢ���� �־�����.
 *
 * ��       �� : ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_1932 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] d = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        d[0][0] = a[0][0];
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                d[i][j] = d[i-1][j] + a[i][j];
                
                if (j-1 >= 0 && d[i][j] < d[i-1][j-1] + a[i][j]) {
                    d[i][j] = d[i-1][j-1] + a[i][j];
                }
            }
        }
        
        int ans = d[n-1][0];
        for (int i = 0; i < n; i++) {
            if (ans < d[n-1][i]) {
                ans = d[n-1][i];
            }
        }
        
        System.out.println(ans);
    }
}
