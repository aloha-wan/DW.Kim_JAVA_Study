package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 21.
 * ���� ���� : ������ ��
 * ���� ��ȣ : 11057
 * ���� ��ó : https://www.acmicpc.net/problem/
 * 
 * ��       �� : ������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. �̶�, ������ ���� ���Ƶ� ������������ ģ��.
 *          ���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.
 *          ���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.
 *
 * ��       �� : ù° �ٿ� N (1 �� N �� 1,000)�� �־�����.
 *
 * ��       �� : ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.
 *
 * 
 **/
public class Main_11057 {

    public static long mod = 10007;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[][] d = new long[n+1][10];
        
        for (int i=0; i<=9; i++) {
            d[1][i] = 1;
        }
        
        for (int i=2; i<=n; i++) {
            for (int j=0; j<=9; j++) {
                for (int k = 0; k <= j; k++) {
                    d[i][j] += d[i-1][k];
                    d[i][j] %= mod;
                }
            }
        }
        
        long ans = 0;
        
        for (int i = 0; i < 10; i++) {
            ans += d[n][i];
        }
        
        ans %= mod;
        
        System.out.println(ans);
    }
}