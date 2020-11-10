package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 10.
 * ���� ���� : �ܾ������
 * ���� ��ȣ : 9093
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, ������ �ϳ� �־�����. 
 *          �ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
 *
 * ��       �� : �� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_9093 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
				
		int number = Integer.parseInt(sc.nextLine());
		
		String[] arr = new String[number];
		
		for(int i = 0; i<number; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < number; i++) {
			String[] tmp = arr[i].split(" ");
			
			for(int j = 0; j < tmp.length; j++) {
				
				int size = tmp[j].length() - 1;
				String s2 = "";
				
				while(size >= 0) {
					s2 = s2 + tmp[j].charAt(size--);
				}
				System.out.print(s2 + " ");
			}
			System.out.println();
		}
	}
	
}
