package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 18.
 * 문제 제목 : 1, 2, 3 더하기 3
 * 문제 번호 : 15988
 * 문제 출처 : https://www.acmicpc.net/problem/15988
 * 
 * 문       제 : 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 *           1+1+1+1
 *           1+1+2
 *           1+2+1
 *           2+1+1
 *           2+2
 *           1+3
 *           3+1
 *          정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 1,000,000보다 작거나 같다.
 *
 * 출       력 : 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 1,000,000,009로 나눈 나머지를 출력한다.
 *
 * 
 **/
public class Main_15988 {

	static final long mod = 1000000009L;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] d = new long[1000001];
		
		d[0] = 1;
		for(int i = 0; i <= 1000000; i++) {
			for(int j = 1; j <= 3; j++) {
				if(i - j >= 0) {
					d[i] += d[i-j];
				}
			}
			d[i] %= mod;
		}
		
		int t = sc.nextInt();		// 테스트 케이스 개수 입력
		while(t-- > 0) {
			int n = sc.nextInt();	// 테스트 할 정수 입력
			System.out.println(d[n]);
		}

	}

}
