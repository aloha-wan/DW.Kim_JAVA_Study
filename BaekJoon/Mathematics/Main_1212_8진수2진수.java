package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 23.
 * 문제 제목 : 8진수2진수
 * 문제 번호 : 1212
 * 문제 출처 : https://www.acmicpc.net/problem/1212
 * 
 * 문       제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
 *
 * 출       력 : 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
 *
 * 
 **/
public class Main_1212_8진수2진수 {

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
