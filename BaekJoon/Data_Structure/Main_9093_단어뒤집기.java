package Data_Structure;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 11.
 * ���� ���� : �ܾ������
 * ���� ��ȣ : 9093
 * ���� ��ó : https://www.acmicpc.net/problem/9093
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
public class Main_9093_�ܾ������ {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// �׽�Ʈ ���̽��� ���� T �Է�
		int T = sc.nextInt();
		
		String[] arr = new String[T];
		
		// �׽�Ʈ ���̽� ������ŭ �ܾ� �Է�
		for(int i = 0; i < T; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < T; i++) {
			// " "���� ���ڸ� �߶� tmp[]�� �Է��Ѵ�.
			String[] tmp = arr[i].split(" ");
			
			for(int j = 0; j < tmp.length; j++) {
				
				int size = tmp[j].length() - 1;	// �ڸ� ������ ����
				String s2 = "";
				
				// �ڸ� ���ڸ� ����� s2�� �Է�
				while(size >= 0) {
					s2 = s2 + tmp[j].charAt(size--);
				}
				System.out.print(s2 + " ");
			}
			System.out.println();
		}
	}
	
}
