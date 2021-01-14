package Dynamic_Programming;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : �պ���
 * ���� ��ȣ : 2225
 * ���� ��ó : https://www.acmicpc.net/problem/2225
 * 
 * ��       �� : 0���� N������ ���� K���� ���ؼ� �� ���� N�� �Ǵ� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ������ ������ �ٲ� ���� �ٸ� ���� ����(1+2�� 2+1�� ���� �ٸ� ���). ���� �� ���� ���� ���� �� �� ���� �ִ�.
 *
 * ��       �� : ù° �ٿ� �� ���� N(1 �� N �� 200), K(1 �� K �� 200)�� �־�����.
 *
 * ��       �� : ù° �ٿ� ���� 1,000,000,000���� ���� �������� ����Ѵ�.
 *
 * 
 **/
public class Main_2225_�պ��� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 0���� n���� ����
		int k = sc.nextInt();		// 0���� n���� ���� �� ���� k��
		long[][] d = new long[k+1][n+1];
		d[0][0] = 1;
		
		// d[k][n];
		for(int i = 1; i <= k; i++) {
			for(int j = 0; j <= n; j++) {
				for(int l = 0; l <= j; l++) {
					d[i][j] += d[i-1][j-l];
					d[i][j] %= 1000000000;
				}
			}
		}
		
		System.out.println(d[k][n]);
	}
}
