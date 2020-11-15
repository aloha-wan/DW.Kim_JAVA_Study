package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 7.
 * ���� ���� : ���ϱ� ����Ŭ
 * ���� ��ȣ : 1110
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
 *          ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
 *          �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
 *          26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
 *          ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
 *          N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
 *
 * ��       �� : ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
 *
 * 
 **/
public class Main_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int left = N/10;
		int right = N%10;
		
		int newRight = 0;
		int count = 0;
		
		while(true) {
			count++;
			
			newRight = left + right;
			left = right;
			right = newRight % 10;
			
			if(N == (left*10)+right) {
				break;
			}
			
		}
		
		System.out.println(count);
		
	}
}