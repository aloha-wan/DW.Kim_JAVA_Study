package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : ����
 * ���� ��ȣ : 2588
 * ���� ��ó : https://www.acmicpc.net/problem/2588
 * 
 * ��       �� : (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
 *         
 *            472   - (1)
 *         x  385   - (2)
 *         -------
 *           2360   - (3)
 *          3776    - (4)
 *         1416     - (5)
 *         -------
 *         181720   - (6)
 *         (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
 *
 * ��       �� : ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_2588_���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int re   = 0;
		int re_1 = A * (B%10);
		int re_2 = A * (B%100/10);
		int re_3 = A * (B/100);
		
		re = re_1 * 1 + re_2 * 10 + re_3 * 100;
        
		System.out.println(re_1);
        System.out.println(re_2);
        System.out.println(re_3);
        System.out.println(re);
	}
}
