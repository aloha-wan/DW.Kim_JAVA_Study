package Materialization;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 16.
 * 문제 제목 : A+B - 5
 * 문제 번호 : 10952
 * 문제 출처 : https://www.acmicpc.net/problem/10952
 * 
 * 문       제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *          각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *          입력의 마지막에는 0 두 개가 들어온다.
 *
 * 출       력 : 각 테스트 케이스마다 A+B를 출력한다.
 *
 * 
 **/
public class Main_10952_AB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}else if(A > 0 && B > 0 && A < 10 && B < 10){
				System.out.println(A+B);
			}
		}
		sc.close();
	}
}
