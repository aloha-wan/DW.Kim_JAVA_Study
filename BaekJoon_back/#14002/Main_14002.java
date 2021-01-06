package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 17.
 * 문제 제목 : 14002
 * 문제 번호 : 가장 긴 증가하는 부분 수열 4
 * 문제 출처 : https://www.acmicpc.net/problem/
 * 
 * 문       제 : 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
 *          예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
 *
 * 입       력 : 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
 *          둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 *
 * 출       력 : 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
 *          둘째 줄에는 가장 긴 증가하는 부분 수열을 출력한다. 그러한 수열이 여러가지인 경우 아무거나 출력한다.
 *
 * 
 **/
public class Main_14002 {

	static int[] a;
	static int[] d;
	static int[] v;
	static void go(int p) {
		if(p == -1) {
			return;
		}
		go(v[p]);
		System.out.print(a[p] + " ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		d = new int[n];
		v = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = 1;
			v[i] = -1;
			for(int j = 0; j < i; j++) {
				if(a[j] < a[i] && d[i] < d[j]+1) {
					d[i] = d[j] + 1;
					v[i] = j;
				}
			}
		}
		
		int ans = d[0];
		int p = 0;
		for(int i = 0; i < n; i++) {
			if(ans < d[i]) {
				ans = d[i];
				p = i;
			}
		}
		System.out.println(ans);
		
		go(p);
		System.out.println();
	}

}
