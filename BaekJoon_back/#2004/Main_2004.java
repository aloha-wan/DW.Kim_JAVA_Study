package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 28.
 * 문제 제목 : 조합 0의 개수
 * 문제 번호 : 2004
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 정수 n, m (0 ≤ m ≤ n ≤ 2,000,000,000, n ≠ 0)이 들어온다.
 *
 * 출       력 : 첫째 줄에 0의 개수를 출력한다.
 *
 * 
 **/
public class Main_2004 {

	//1676 팩토리얼 0개의 개수를 구하는 것의 응용
	// nCm = n! / {(n-m)! * m!}
	// 이 경우는 2의 개수보다 5의 개수가 적을 수 도 있기 때문에 다 구해준다.
	// 끝자리 0의 개수 = 분자의 0의 개수 - 분모 0의 개수
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        long two = 0, five = 0;
        
        for (long i = 2; i <= n; i *= 2) {
            two += n/i;
        }
        for (long i = 2; i <= n-m; i *= 2) {
            two -= (n-m)/i;
        }
        for (long i = 2; i <= m; i *= 2) {
            two -= m/i;
        }
        for (long i = 5; i <= n; i *= 5) {
            five += n/i;
        }
        for (long i = 5; i <= n-m; i *= 5) {
            five -= (n-m)/i;
        }
        for (long i = 5; i <= m; i *= 5) {
            five -= m / i;
        }
        
        System.out.println(Math.min(two,five));
    }
}