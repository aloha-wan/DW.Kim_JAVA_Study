package Dynamic_Programming;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 28.
 * 문제 제목 : 2 X n 타일링 2
 * 문제 번호 : 11727
 * 문제 출처 : https://www.acmicpc.net/problem/11727
 * 
 * 문       제 : 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오. 아래 그림은 2×17 직사각형을 채운 한가지 예이다.
 *
 * 입       력 : 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 *
 * 출       력 : 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 *
 * 
 **/
public class Main_11727_2n타일링2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] d = new int[1001];

		d[0] = 1;
		d[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2] * 2;
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}

}
