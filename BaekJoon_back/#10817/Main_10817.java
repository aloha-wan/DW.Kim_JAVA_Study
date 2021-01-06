package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 3.
 * 문제 제목 : 세 수
 * 문제 번호 : 10817
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 *
 * 입    력 : 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 *
 * 출    력 : 두 번째로 큰 정수를 출력한다.
 *
 * 
 **/
public class Main_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []A = new int [3];
		
		for(int i = 0; i < 3; i++) {
			A[i] = sc.nextInt();
		}
		
		int B = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = i; j < 3; j++) {
				if(A[i] > A[j]) {
					B = A[i];
					A[i] = A[j];
					A[j] = B;
				}
			}
		}
		int ee = A[1];
        System.out.print(ee);
	}
}