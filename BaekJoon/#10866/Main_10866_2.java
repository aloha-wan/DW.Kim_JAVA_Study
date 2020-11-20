package DW_Kim_JAVA_Study_BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;


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
public class Main_10866_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String inputText;
		ArrayList<Integer> deque = new ArrayList<>();
		
		int inputNum;
		
		for(int i = 0; i < N; i++) {
			inputText = sc.next();
			
			switch(inputText) {
				case "push_front":
					inputNum = sc.nextInt();
					deque.add(0, inputNum);
					break;
				
				case "push_back":
					inputNum = sc.nextInt();
					deque.add(inputNum);
					break;
				
				case "pop_front":
					if(deque.size() != 0) {
						System.out.println(deque.get(0));
						deque.remove(0);
					} else {
						System.out.println(-1);
					}
					break;
				
				case "pop_back":
					if(deque.size() != 0) {
						System.out.println(deque.get(deque.size() - 1));
						deque.remove(deque.size() - 1);
					} else {
						System.out.println(-1);
					}
					break;
					
				case "size":
					System.out.println(deque.size());
					break;
					
				case "empty":
					if(deque.size() != 0) {
						System.out.println(0);
					} else {
						System.out.println(1);
					}
					break;
				
				case "front":
					if(deque.size() != 0) {
						System.out.println(deque.get(0));
					} else {
						System.out.println(-1);
					}
					break;
				
				case "back":
					if(deque.size() != 0) {
						System.out.println(deque.get(deque.size() - 1));
					} else {
						System.out.println(-1);
					}
					break;
			}
		}

	}

}
