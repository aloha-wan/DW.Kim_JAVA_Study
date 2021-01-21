package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 21.
 * ���� ���� : GCD ��
 * ���� ��ȣ : 9613
 * ���� ��ó : https://www.acmicpc.net/problem/9613
 * 
 * ��       �� : ���� ���� n���� �־����� ��, ������ ��� ���� GCD�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� t (1 �� t �� 100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. 
 *         �� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)�� �־�����, �������� n���� ���� �־�����. �Է����� �־����� ���� 1,000,000�� ���� �ʴ´�.
 *
 * ��       �� : �� �׽�Ʈ ���̽����� ������ ��� ���� GCD�� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_9613_GCD�� {
	
	// �ִ� �����
	public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a%b);
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//�׽�Ʈ ���̽� ����
		
		while(t-- > 0) {
			int n = sc.nextInt();		// �׽�Ʈ �� ���� ����
			int[] arr = new int[n];		// �׽�Ʈ �� ���� �迭�� �Է�
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			long ans = 0;
			// �ϳ��� �ִ� ������� ���ϸ� ��ü�� �ִ� ������� ���� �� �ִ�.
			for(int i = 0; i < n-1; i++) {
				for(int j = i+1; j < n; j++) {
					ans += GCD(arr[i], arr[j]);
				}
			}
			System.out.println(ans);
		}
	}
}
