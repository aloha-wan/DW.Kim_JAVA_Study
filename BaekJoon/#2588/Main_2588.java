package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 4.
 * 문제 제목 : 곱셈
 * 문제 번호 : 2588
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *          (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 *
 * 출    력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 *
 * 
 **/
public class Main_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int re   = 0;
		int re_1 = A * (B%10);
		int re_2 = A * (B%100/10);
		int re_3 = A * (B/100);
		
		re = re_1 * 1 + re_2 * 10 + re_3 * 100;
        
		System.out.println(re_1);
        System.out.println(re_2);
        System.out.println(re_3);
        System.out.println(re);
	}
}