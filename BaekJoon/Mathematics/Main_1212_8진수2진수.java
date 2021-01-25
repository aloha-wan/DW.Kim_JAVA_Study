package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 23.
 * ���� ���� : 8����2����
 * ���� ��ȣ : 1212
 * ���� ��ó : https://www.acmicpc.net/problem/1212
 * 
 * ��       �� : 8������ �־����� ��, 2������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� 8������ �־�����. �־����� ���� ���̴� 333,334�� ���� �ʴ´�.
 *
 * ��       �� : ù° �ٿ� �־��� ���� 2������ ��ȯ�Ͽ� ����Ѵ�. ���� 0�� ��츦 �����ϰ�� �ݵ�� 1�� �����ؾ� �Ѵ�.
 *
 * 
 **/
public class Main_1212_8����2���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] st = s.split("");
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++) {
			int num = Integer.parseInt(st[i]);
			if(i != 0 && (num <= 1)) {
				sb.append("00");
			} else if(i != 0 && (num == 2 || num == 3)) {
				sb.append("0");
			}
			sb.append(Integer.toBinaryString(num));
		}
		System.out.println(sb);

	}

}
