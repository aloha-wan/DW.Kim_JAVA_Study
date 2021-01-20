package Data_Structure;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : ��ū��
 * ���� ��ȣ : 17298
 * ���� ��ó : https://www.acmicpc.net/problem/17298
 * 
 * ��       �� : ũ�Ⱑ N�� ���� A = A1, A2, ..., AN�� �ִ�. ������ �� ���� Ai�� ���ؼ� ��ū�� NGE(i)�� ���Ϸ��� �Ѵ�. Ai�� ��ū���� �����ʿ� �����鼭 Ai���� ū �� �߿��� ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�. �׷��� ���� ���� ��쿡 ��ū���� -1�̴�.
 *         ���� ���, A = [3, 5, 2, 7]�� ��� NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1�̴�. A = [9, 5, 4, 8]�� ��쿡�� NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1�̴�.
 *
 * ��       �� : ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000,000)�� �־�����. ��°�� ���� A�� ���� A1, A2, ..., AN (1 �� Ai �� 1,000,000)�� �־�����.
 *
 * ��       �� : �� N���� �� NGE(1), NGE(2), ..., NGE(N)�� �������� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_17298_��ū�� {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());	// ���� ũ��
		int[] a = new int[n];						// �Էµ����� �����ϴ� �迭
		int[] ans = new int[n];						// ����� �����ϴ� �迭
		
		String[] temp = bf.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}
		
		Stack<Integer> st = new Stack<>();			// �ε��� ���� ������ ���� ����
		st.push(0);
		
		for(int i = 1; i < n; i++) {
			if(st.isEmpty()) {
				st.push(i);			
			}
			// ��ū���� �Ǵ��ϴ� ���� -      ���ÿ� ���� ���� �� < ���� ��
			while (!st.isEmpty() && a[st.peek()] < a[i]) {
				ans[st.pop()] = -1;
			}
			st.push(i);
		}
		
		// ���ÿ� ���� ������ -1 
		while (!st.empty()) {
            ans[st.pop()] = -1;
        }
		
		// ���� ����Ѵ�.
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        
        bw.write("\n");
        bw.flush();
    }

}
