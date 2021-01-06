package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 20.
 * ���� ���� : ��
 * ���� ��ȣ : 10866
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ����� �� ���� �����̴�.
 *          	push_front X : ���� X�� ���� �տ� �ִ´�.
 *          	push_back X  : ���� X�� ���� �ڿ� �ִ´�.
 *          	pop_front	 : ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *          	pop_back	 : ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *              size		 : ���� ����ִ� ������ ������ ����Ѵ�.
 *              empty		 : ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
 *              front		 : ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *              back		 : ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *          
 * ��       �� : ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
 *          ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 *
 * ��       �� : ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_10866_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// �⺻ ���� ���� �� �ν��Ͻ� ����
		String kind = "";								//�������� �־��� ����� �з��ϱ� ���� �ʿ��� ���� ����
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deQ = new ArrayDeque<Integer>();	//������ DeQue �� �����ϱ� ���� ��ü
		
		while(n-- != 0) {
			kind = br.readLine();
			if(kind.startsWith("push_front")) { 		// void addFirst(E e) : ���� ���� �տ� ������ �����Ѵ�.
				deQ.addFirst(Integer.parseInt(kind.split(" ")[1]));
			} else if(kind.startsWith("push_back")) { 	// void addLast(E e) : ���� ���� �ڿ� ������ �����Ѵ�.
				deQ.addLast(Integer.parseInt(kind.split(" ")[1]));
			} else if(kind.startsWith("pop_front")) { 	// boolean isEmpty() : ���� ����ִ��� üũ�Ѵ�, ����ִٸ� true, ������� �ʴٸ� false ��ȯ�Ѵ�.
														//E pollFirst() : ���� ���� �տ� �ִ� ������ ���鼭 �� ������ ��ȯ�Ѵ�.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.pollFirst() + "\n");
			} else if(kind.startsWith("pop_back")) { 	// E pollLast() : ���� ���� �ڿ� �ִ� ������ ���鼭 �� ������ ��ȯ�Ѵ�.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.pollLast()+ "\n");
			} else if(kind.equals("size")) { 			// public int size() : ���� ũ�⸦ ��ȯ�Ѵ�.
				sb.append(deQ.size() + "\n");
			} else if(kind.equals("empty")) {			// boolean isEmpty() : ���� ����ִ��� üũ�Ѵ�, ����ִٸ� true, ������� �ʴٸ� false ��ȯ�Ѵ�.
				sb.append(deQ.isEmpty() ? "1\n" : "0\n");
			} else if(kind.equals("front")) { 			// E getFirst() : ���� ���� �տ� �ִ� ������ ��ȯ�Ѵ�.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.getFirst() + "\n");
			} else if(kind.equals("back")) { 			// E getLast() : ���� ���� �ڿ� �ִ� ������ ��ȯ�Ѵ�.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.getLast() + "\n");
			} else {
				sb.append("error\n");
			}
		}
		System.out.println(sb.toString());
	}
}