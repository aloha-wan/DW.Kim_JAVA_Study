package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 5.
 * ���� ���� : A+B - 5
 * ���� ��ȣ : 10952
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��       �� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10) �Է��� ���������� 0 �� ���� ���´�.
 *
 * ��       �� : �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 *
 * 
 **/
public class Main_10952 {

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