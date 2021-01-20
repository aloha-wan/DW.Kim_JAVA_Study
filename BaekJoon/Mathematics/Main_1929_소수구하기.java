package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 21.
 * 문제 제목 : 소수 구하기
 * 문제 번호 : 1929
 * 문제 출처 : https://www.acmicpc.net/problem/1929
 * 
 * 문       제 : M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 *
 * 출       력 : 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 *
 * 
 **/
public class Main_1929_소수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();		// 작은수
		int N = sc.nextInt();		// 큰수
		
		boolean[] check = new boolean[N+1];
		check[0] = check[1] = true;

		// 에라토스테네스의 체 이용 : 전체 수에서 배수를 하나씩 지워가면서 거르는 방식으로 소수 추출하는 방법
		for(int i = 2; i * i <= N; i++) {
			if(check[i] == true) {
				continue;
			}
			for(int j = i+i; j <= N; j += i) {
				check[j] = true;
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(check[i] == false) {
				System.out.println(i);
			}
		}
		/* 이렇게 풀었지만 위의 답이 좀더 깔끔한거 같아 수정함.
		int[] arr = new int[N+1];
		arr[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			for(int j = 2; j * i <= N; j++) {
				arr[j * i] = 1;
			}
		}

		for(int i = M; i <= N; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
		*/

	}

}
