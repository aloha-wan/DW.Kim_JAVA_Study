package Dynamic_Programming;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : 2��n Ÿ�ϸ�
 * ���� ��ȣ : 11726
 * ���� ��ó : https://www.acmicpc.net/problem/11726
 * 
 * ��       �� : 2��n ũ���� ���簢���� 1��2, 2��1 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          �Ʒ� �׸��� 2��5 ũ���� ���簢���� ä�� �� ���� ����� ���̴�.
 *
 * ��       �� : ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
 *
 * ��       �� : ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 *
 * 
 **/
public class Main_11726_2xnŸ�ϸ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//2xn ũ���� ���簢�� 
		int []d = new int[1001];

		d[0] = 1;
		d[1] = 1;
		
		//��ȭ���� �̿��Ͽ� ����
		for(int i = 2; i < n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		
		System.out.println(d[n]);

	}

}
