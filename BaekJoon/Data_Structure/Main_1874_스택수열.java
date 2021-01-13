package Data_Structure;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : ���� ����
 * ���� ��ȣ : 1874
 * ���� ��ó : https://www.acmicpc.net/problem/1874
 * 
 * ��       �� : ���� (stack)�� �⺻���� �ڷᱸ�� �� �ϳ���, ��ǻ�� ���α׷��� �ۼ��� �� ���� �̿�Ǵ� �����̴�. 
 *          ������ �ڷḦ �ִ� (push) �Ա��� �ڷḦ �̴� (pop) �Ա��� ���� ���� ���߿� �� �ڷᰡ ���� ���� ������ (LIFO, Last in First out) Ư���� ������ �ִ�.
 *          1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�. 
 *          �̶�, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����. 
 *          ������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, �ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�.
 *          �̸� ����ϴ� ���α׷��� �ۼ��϶�.
 *
 * ��       �� : ù �ٿ� n (1 �� n �� 100,000)�� �־�����. ��° �ٺ��� n���� �ٿ��� ������ �̷�� 1�̻� n������ ������ �ϳ��� ������� �־�����. ���� ���� ������ �� �� ������ ���� ����.
 *
 * ��       �� : �Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. �Ұ����� ��� NO�� ����Ѵ�.
 *
 * 
 **/
public class Main_1874_���ü��� {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> s = new Stack<>();
		ArrayList<String> al = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());	// �Է��� ���� �Է�
		int[] arr = new int[n];
		int k = 0;									//������ �Էµ� ��
		
		// ������ �� �Է�
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= n; i++) {
			s.push(i);
			al.add("+");
			
			while(!s.isEmpty() && s.peek() == arr[k]) {
				s.pop();
				al.add("-");
				k++;
			}
		}
		
		if(n == k) {
			for(String s1 : al) {
				System.out.println(s1);
			}
		}else {
			System.out.println("NO");
		}

	}

}
