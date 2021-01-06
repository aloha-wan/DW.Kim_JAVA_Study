package Dynamic_Programming;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 연속합
 * 문제 번호 : 1912
 * 문제 출처 : https://www.acmicpc.net/problem/1912
 * 
 * 문       제 : n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다.
 *          예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.
 *
 * 입       력 : 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
 *
 * 출       력 : 첫째 줄에 답을 출력한다.
 *
 * 
 **/
public class Main_1912_연속합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// 입력할 수의 갯수
		int[] a = new int[n];			// 실제로 입력 받은 수들
		int[] d = new int[n];			// i번째에서 끝나는 연속합의 최대값
		int ans = d[0];					// 연속합의 최대값 중 가장 큰 값
		
		// 입력 받을 수 만큼 입력받는다.
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		//연속하여 i-1 번째까지 합한수와 i 번째 수를 합한 수가 i 번째 수보다 크면 합한다.
		// 작으면 연속 중단하여 i번째 수를 d[]에 다시 시작.
		for(int i = 0; i < n; i++){
			d[i] = a[i];
			
			// i가 1일때 d[0]의 값이 필요하기 때문에 있는 조건
			if(i == 0) {
				continue;
			}
			
			if(d[i] < d[i-1] + a[i]) {
				d[i] = d[i-1] + a[i];
			}
		}
		
		// 연속된 몇 개의 수를 선택하여 가장 큰 합을 구한다.
		for(int i = 0; i < n; i++) {
			if(ans < d[i]) {
				ans = d[i];
			}
		}
		
		System.out.println(ans);

	}

}
