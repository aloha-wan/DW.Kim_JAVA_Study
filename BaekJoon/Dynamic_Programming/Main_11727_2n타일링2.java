package Dynamic_Programming;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 28.
 * ���� ���� : 2 X n Ÿ�ϸ� 2
 * ���� ��ȣ : 11727
 * ���� ��ó : https://www.acmicpc.net/problem/11727
 * 
 * ��       �� : 2��n ���簢���� 1��2, 2��1�� 2��2 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. �Ʒ� �׸��� 2��17 ���簢���� ä�� �Ѱ��� ���̴�.
 *
 * ��       �� : ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
 *
 * ��       �� : ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 *
 * 
 **/
public class Main_11727_2nŸ�ϸ�2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] d = new int[1001];

		d[0] = 1;
		d[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2] * 2;
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}

}
