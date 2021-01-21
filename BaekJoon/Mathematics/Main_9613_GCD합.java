package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 21.
 * 문제 제목 : GCD 합
 * 문제 번호 : 9613
 * 문제 출처 : https://www.acmicpc.net/problem/9613
 * 
 * 문       제 : 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다. 
 *         각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
 *
 * 출       력 : 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
 *
 * 
 **/
public class Main_9613_GCD합 {
	
	// 최대 공약수
	public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a%b);
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//테시트 케이스 개수
		
		while(t-- > 0) {
			int n = sc.nextInt();		// 테스트 할 숫자 갯수
			int[] arr = new int[n];		// 테스트 할 숫자 배열에 입력
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			long ans = 0;
			// 하나씩 최대 공약수를 구하면 전체의 최대 공약수를 구할 수 있다.
			for(int i = 0; i < n-1; i++) {
				for(int j = i+1; j < n; j++) {
					ans += GCD(arr[i], arr[j]);
				}
			}
			System.out.println(ans);
		}
	}
}
