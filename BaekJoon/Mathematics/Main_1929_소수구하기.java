package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 21.
 * ���� ���� : �Ҽ� ���ϱ�
 * ���� ��ȣ : 1929
 * ���� ��ó : https://www.acmicpc.net/problem/1929
 * 
 * ��       �� : M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.
 *
 * ��       �� : �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1929_�Ҽ����ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();		// ������
		int N = sc.nextInt();		// ū��
		
		boolean[] check = new boolean[N+1];
		check[0] = check[1] = true;

		// �����佺�׳׽��� ü �̿� : ��ü ������ ����� �ϳ��� �������鼭 �Ÿ��� ������� �Ҽ� �����ϴ� ���
		for(int i = 2; i * i <= N; i++) {
			if(check[i] == true) {
				continue;
			}
			for(int j = i+i; j <= N; j += i) {
				check[j] = true;
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(check[i] == false) {
				System.out.println(i);
			}
		}
		/* �̷��� Ǯ������ ���� ���� ���� ����Ѱ� ���� ������.
		int[] arr = new int[N+1];
		arr[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			for(int j = 2; j * i <= N; j++) {
				arr[j * i] = 1;
			}
		}

		for(int i = M; i <= N; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
		*/

	}

}
