package Materialization;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 22.
 * 문제 제목 : 윤년
 * 문제 번호 : 2753
 * 문제 출처 : https://www.acmicpc.net/problem/2753
 * 
 * 문       제 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 *          윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 *          예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 *
 * 입       력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 *
 * 출       력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 *
 * 
 **/
public class Main_2753_윤년 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();	// 연도

		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		} else {
			System.out.print("0");
		}

	}

}
