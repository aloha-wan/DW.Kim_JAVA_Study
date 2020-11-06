package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 6.
 * 문제 제목 : 보물
 * 문제 번호 : 1026
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
 *          길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
 *          S = A[0]*B[0] + ... + A[N-1]*B[N-1]
 *          S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
 *          S의 최솟값을 출력하는 프로그램을 작성하시오.
 * 
 * 입       력 : 첫째 줄에 N이 주어진다. 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 셋째 줄에는 B에 있는 수가 순서대로 주어진다.
 *           N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
 *
 * 출       력 : 첫째 줄에 S의 최솟값을 출력한다.
 *
 * 
 **/
public class Main_1026 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		int max = 0; 

		int []A = new int [N];
		int []B = new int [N];

		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);// 1 2 3 4 5 오름차순

		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(B[i] < B[j]) {
					max = B[i];
					B[i] = B[j];
					B[j] = max;
				}
			}
		}

		for(int i = 0; i < N; i++) {
			sum += A[i] * B[i];
		}

		System.out.println(sum);
		
	}

}