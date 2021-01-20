package Data_Structure;

import java.io.*;
import java.util.Stack;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : ����ū��
 * ���� ��ȣ : 17299
 * ���� ��ó : https://www.acmicpc.net/problem/17299
 * 
 * ��       �� : ũ�Ⱑ N�� ���� A = A1, A2, ..., AN�� �ִ�. ������ �� ���� Ai�� ���ؼ� ����ū�� NGF(i)�� ���Ϸ��� �Ѵ�.
 *         Ai�� ���� A���� ������ Ƚ���� F(Ai)��� ���� ��, Ai�� ����ū���� �����ʿ� �����鼭 ���� A���� ������ Ƚ���� F(Ai)���� ū �� �߿��� ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�. �׷��� ���� ���� ��쿡 ����ū���� -1�̴�.
 *         ���� ���, A = [1, 1, 2, 3, 4, 2, 1]�� ��� F(1) = 3, F(2) = 2, F(3) = 1, F(4) = 1�̴�. 
 *         A1�� �����ʿ� �����鼭 ������ Ƚ���� 3���� ū ���� ���� ������, NGF(1) = -1�̴�. 
 *         A3�� ��쿡�� A7�� �����ʿ� �����鼭 F(A3=2) < F(A7=1) �̱� ������, NGF(3) = 1�̴�. NGF(4) = 2, NGF(5) = 2, NGF(6) = 1 �̴�.
 *
 * ��       �� : ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000,000)�� �־�����. ��°�� ���� A�� ���� A1, A2, ..., AN (1 �� Ai �� 1,000,000)�� �־�����.
 *
 * ��       �� : �� N���� �� NGF(1), NGF(2), ..., NGF(N)�� �������� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_17299_����ū�� {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());	// ���� ũ��
		int[] a = new int[n];						// �Էµ����� �����ϴ� �迭
		int[] ans = new int[n];						// ����� �����ϴ� �迭
		int[] freq = new int[1000001];				// ���� Ƚ�� �����ϴ� �迭
		
		String[] temp = bf.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]);
			freq[a[i]] += 1;
		}
		
		Stack<Integer> st = new Stack<>();			// �ε��� ���� ������ ���� ����
		st.push(0);
		
		for(int i = 1; i < n; i++) {
			if(st.isEmpty()) {
				st.push(i);
			}
			// ����ū���� �Ǵ��ϴ� ���� -      ���ÿ� ���� ���� �� < ���� ���� ������ Ƚ��
			while(!st.isEmpty() && freq[a[st.peek()]] < freq[a[i]]) {
				ans[st.pop()] = a[i];
			}
			st.push(i);
		}

		// ���ÿ� ���� ������ -1 
		while(!st.empty()) {
			ans[st.pop()] = -1;
		}

		// ���� ����Ѵ�.
		for(int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();

	}

}
