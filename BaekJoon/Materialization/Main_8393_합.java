package Materialization;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : ��
 * ���� ��ȣ : 8393
 * ���� ��ó : https://www.acmicpc.net/problem/8393
 * 
 * ��       �� : n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
 *
 * ��       �� : 1���� n���� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_8393_�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum +=  i;
		}
		System.out.print(sum);
	}
}
