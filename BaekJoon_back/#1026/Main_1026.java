package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 6.
 * ���� ���� : ����
 * ���� ��ȣ : 1026
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ���� ������ ������ �׻� ū ��ĩ�Ÿ����� ���� �־���. �� ������ ���� �������� ������ ���� ������ ���� ū ����� �ɾ���.
 *          ���̰� N�� ���� �迭 A�� B�� �ִ�. ������ ���� �Լ� S�� ��������.
 *          S = A[0]*B[0] + ... + A[N-1]*B[N-1]
 *          S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �� �ȴ�.
 *          S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��       �� : ù° �ٿ� N�� �־�����. ��° �ٿ��� A�� �ִ� N���� ���� ������� �־�����, ��° �ٿ��� B�� �ִ� ���� ������� �־�����.
 *           N�� 50���� �۰ų� ���� �ڿ����̰�, A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.
 *
 * ��       �� : ù° �ٿ� S�� �ּڰ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1026 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		int max = 0; 

		int []A = new int [N];
		int []B = new int [N];

		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);// 1 2 3 4 5 ��������

		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(B[i] < B[j]) {
					max = B[i];
					B[i] = B[j];
					B[j] = max;
				}
			}
		}

		for(int i = 0; i < N; i++) {
			sum += A[i] * B[i];
		}

		System.out.println(sum);
		
	}

}