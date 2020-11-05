package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 5.
 * 문제 제목 : A+B - 7
 * 문제 번호 : 11021
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출       력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 *
 * 
 **/
public class Main_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int []A = new int [T];
		int []B = new int [T];

		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < T; i++) {
			System.out.println("Case #" + (i+1) + ": " + (A[i]+B[i]));
		}
	}
}