package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 5.
 * ���� ���� : A+B - 7
 * ���� ��ȣ : 11021
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 *
 * ��       �� : �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
 *
 * 
 **/
public class Main_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int []A = new int [T];
		int []B = new int [T];

		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < T; i++) {
			System.out.println("Case #" + (i+1) + ": " + (A[i]+B[i]));
		}
	}
}