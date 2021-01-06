package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 1.
 * ���� ���� : ������
 * ���� ��ȣ : 2231
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. � �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. 
 *          ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�. ���� 245�� 256�� �����ڰ� �ȴ�. 
 *            ����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
 *            �ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.
 *
 * ��       �� : ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.
 *
 * 
 **/
public class Main_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boon = sc.nextInt();
		
		if(boon >= 1000000 && boon <=1) {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		for(int i = 1; i < boon; i++) {
			if(boon == solve(String.valueOf(i))) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
	
	private static int solve(String num) {
		int len = num.length();
		
		int sum = Integer.parseInt(num);
		
		for(int i = 0; i < len; i++) {
			sum += num.charAt(i)-'0';
		}
		return sum;
	}
}