package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 3.
 * ���� ���� : �� ��
 * ���� ��ȣ : 10817
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *
 * ��    �� : ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
 *
 * ��    �� : �� ��°�� ū ������ ����Ѵ�.
 *
 * 
 **/
public class Main_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []A = new int [3];
		
		for(int i = 0; i < 3; i++) {
			A[i] = sc.nextInt();
		}
		
		int B = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = i; j < 3; j++) {
				if(A[i] > A[j]) {
					B = A[i];
					A[i] = A[j];
					A[j] = B;
				}
			}
		}
		int ee = A[1];
        System.out.print(ee);
	}
}