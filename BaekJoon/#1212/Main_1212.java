package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 8.
 * ���� ���� : 8���� 2����
 * ���� ��ȣ : 1212
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : 8������ �־����� ��, 2������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� 8������ �־�����. �־����� ���� ���̴� 333,334�� ���� �ʴ´�.
 *
 * ��       �� : ù° �ٿ� �־��� ���� 2������ ��ȯ�Ͽ� ����Ѵ�. ���� 0�� ��츦 �����ϰ�� �ݵ�� 1�� �����ؾ� �Ѵ�.
 *
 * 
 **/
public class Main_1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String line = sc.nextLine();
		
		if(line.equals("0")) {
			System.out.println("0");
		} else {
			int arr[]	= new int[3 * line.length()];
			int idx		= arr.length - 1;
			
			for(int i = 0; i < line.length(); i++) {
				int temp = line.charAt(i) - '0';
				String a1 = Integer.toBinaryString(temp);
				
				if(a1.length() == 3) {
					for(int k = 0; k < a1.length(); k++) {
						arr[idx] = a1.charAt(k) - '0';
						idx--;
					}
				}else if(a1.length() == 2) {
					arr[idx] = 0;
					idx--;
					for(int k = 0; k < a1.length(); k++) {
						arr[idx] = a1.charAt(k) - '0';
						idx--;
					}
				}else {
					arr[idx] = 0;
					idx--;
					arr[idx] = 0;
					idx--;
					arr[idx] = Integer.parseInt(a1);
					idx--;
				}
			}
			boolean flag = false;
			
			for(int i =arr.length - 1; i >= 0; i--) {
				if(!flag) {
					if(arr[i] != 0) {
						flag = true;
						System.out.print(arr[i]);
					}
				}else {
					System.out.print(arr[i]);
				}
			}
		}

	}

}