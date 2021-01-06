package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 7.
 * ���� ���� : �ܾ��� ����
 * ���� ��ȣ : 1152
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *          ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 *
 * ��       �� : ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. 
 *          �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.
 *
 * ��       �� : ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();

		char []ch = str.toCharArray();
		int cnt = 0;
		
		if(ch.length == 0) {
			System.out.println("0");
			return;
		}
		
		for(int i = 0; i < ch.length-1; i++) {
			if(ch[i] == ' ' && ch[i+1] == ' ')
				continue;
			if(ch[i] != ' ' && ch[i+1] == ' ')
				cnt++;
		}
		
		if(ch[ch.length-1] != ' ')
			cnt++;
		
		System.out.println(cnt);
		sc.close();
		
	}
}
