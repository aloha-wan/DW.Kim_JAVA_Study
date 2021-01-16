package Materialization;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 16.
 * 문제 제목 : 합
 * 문제 번호 : 8393
 * 문제 출처 : https://www.acmicpc.net/problem/8393
 * 
 * 문       제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출       력 : 1부터 n까지 합을 출력한다.
 *
 * 
 **/
public class Main_8393_합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum +=  i;
		}
		System.out.print(sum);
	}
}
