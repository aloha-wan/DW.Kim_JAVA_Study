package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 10.
 * 문제 제목 : 단어뒤집기
 * 문제 번호 : 9093
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 *
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
 *          단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 *
 * 출       력 : 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
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
