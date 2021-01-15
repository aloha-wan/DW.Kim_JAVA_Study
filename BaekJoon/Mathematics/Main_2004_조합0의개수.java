package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : ���� 0�� ����
 * ���� ��ȣ : 2004
 * ���� ��ó : https://www.acmicpc.net/problem/2004
 * 
 * ��       �� : nCm�� ���ڸ� 0�� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� ���� n, m (0 �� m �� n �� 2,000,000,000, n �� 0)�� ���´�.
 *
 * ��       �� : ù° �ٿ� 0�� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_2004_����0�ǰ��� {

	//1676 ���丮�� 0���� ������ ���ϴ� ���� ����
	// nCm = n! / {(n-m)! * m!}
	// �� ���� 2�� �������� 5�� ������ ���� �� �� �ֱ� ������ �� �����ش�.
	// ���ڸ� 0�� ���� = ������ 0�� ���� - �и� 0�� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		long two = 0;			// 2�� ����
		long five = 0;			// 5�� ����

		// ������ 2�� ����
		for(long i = 2; i <= n; i *= 2) {
			two += n/i;
		}
		// �и�[(n-m)!]�� 2�� ������ŭ ����.
		for(long i = 2; i <= n-m; i *= 2) {
			two -= (n-m)/i;
		}
		// �и� m�� 2�� ������ŭ �A��.
        for (long i = 2; i <= m; i *= 2) {
            two -= m/i;
        }
        // ������ 5�� ����
        for (long i = 5; i <= n; i *= 5) {
            five += n/i;
        }
        // �и�[(n-m)!]�� 5�� ������ŭ ����.
        for (long i = 5; i <= n-m; i *= 5) {
            five -= (n-m)/i;
        }
        // �и� m�� 5�� ������ŭ ����.
        for (long i = 5; i <= m; i *= 5) {
            five -= m / i;
        }
        
        // 0�� ������ 2*5�� ��츸 �����ǹǷ� 2�� 5�� ���� �� ���� �� ��ŭ 0�� ������
        System.out.println(Math.min(two, five));

	}

}
