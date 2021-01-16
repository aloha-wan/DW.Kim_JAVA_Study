package Materialization;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : A+B - 5
 * ���� ��ȣ : 10952
 * ���� ��ó : https://www.acmicpc.net/problem/10952
 * 
 * ��       �� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
 *          �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 *          �Է��� ���������� 0 �� ���� ���´�.
 *
 * ��       �� : �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 *
 * 
 **/
public class Main_10952_AB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}else if(A > 0 && B > 0 && A < 10 && B < 10){
				System.out.println(A+B);
			}
		}
		sc.close();
	}
}
