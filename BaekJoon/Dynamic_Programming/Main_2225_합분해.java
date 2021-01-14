package Dynamic_Programming;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 14.
 * 문제 제목 : 합분해
 * 문제 번호 : 2225
 * 문제 출처 : https://www.acmicpc.net/problem/2225
 * 
 * 문       제 : 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 *          덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우). 또한 한 개의 수를 여러 번 쓸 수도 있다.
 *
 * 입       력 : 첫째 줄에 두 정수 N(1 ≤ N ≤ 200), K(1 ≤ K ≤ 200)가 주어진다.
 *
 * 출       력 : 첫째 줄에 답을 1,000,000,000으로 나눈 나머지를 출력한다.
 *
 * 
 **/
public class Main_2225_합분해 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 0부터 n까지 범위
		int k = sc.nextInt();		// 0부터 n까지 범위 중 정수 k개
		long[][] d = new long[k+1][n+1];
		d[0][0] = 1;
		
		// d[k][n];
		for(int i = 1; i <= k; i++) {
			for(int j = 0; j <= n; j++) {
				for(int l = 0; l <= j; l++) {
					d[i][j] += d[i-1][j-l];
					d[i][j] %= 1000000000;
				}
			}
		}
		
		System.out.println(d[k][n]);
	}
}
