package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 8.
 * 문제 제목 : 8진수 2진수
 * 문제 번호 : 1212
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
 *
 * 출       력 : 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
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