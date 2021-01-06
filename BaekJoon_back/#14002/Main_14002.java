package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 17.
 * ���� ���� : 14002
 * ���� ��ȣ : ���� �� �����ϴ� �κ� ���� 4
 * ���� ��ó : https://www.acmicpc.net/problem/
 * 
 * ��       �� : ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.
 *
 * ��       �� : ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
 *          ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
 *
 * ��       �� : ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
 *          ��° �ٿ��� ���� �� �����ϴ� �κ� ������ ����Ѵ�. �׷��� ������ ���������� ��� �ƹ��ų� ����Ѵ�.
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
