package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 14.
 * 문제 제목 : 조합 0의 개수
 * 문제 번호 : 2004
 * 문제 출처 : https://www.acmicpc.net/problem/2004
 * 
 * 문       제 : nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 정수 n, m (0 ≤ m ≤ n ≤ 2,000,000,000, n ≠ 0)이 들어온다.
 *
 * 출       력 : 첫째 줄에 0의 개수를 출력한다.
 *
 * 
 **/
public class Main_2004_조합0의개수 {

	//1676 팩토리얼 0개의 개수를 구하는 것의 응용
	// nCm = n! / {(n-m)! * m!}
	// 이 경우는 2의 개수보다 5의 개수가 적을 수 도 있기 때문에 다 구해준다.
	// 끝자리 0의 개수 = 분자의 0의 개수 - 분모 0의 개수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		long two = 0;			// 2의 개수
		long five = 0;			// 5의 개수

		// 분자의 2의 개수
		for(long i = 2; i <= n; i *= 2) {
			two += n/i;
		}
		// 분모[(n-m)!]에 2의 개수만큼 뺀다.
		for(long i = 2; i <= n-m; i *= 2) {
			two -= (n-m)/i;
		}
		// 분모 m에 2의 개수만큼 뺸다.
        for (long i = 2; i <= m; i *= 2) {
            two -= m/i;
        }
        // 분자의 5의 개수
        for (long i = 5; i <= n; i *= 5) {
            five += n/i;
        }
        // 분모[(n-m)!]에 5의 개수만큼 뺀다.
        for (long i = 5; i <= n-m; i *= 5) {
            five -= (n-m)/i;
        }
        // 분모 m의 5의 개수만큼 뺀다.
        for (long i = 5; i <= m; i *= 5) {
            five -= m / i;
        }
        
        // 0의 개수는 2*5의 경우만 생성되므로 2와 5의 개수 중 작은 수 만큼 0이 생성됨
        System.out.println(Math.min(two, five));

	}

}
