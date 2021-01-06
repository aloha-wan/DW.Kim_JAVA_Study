package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 12.
 * ���� ���� : ť
 * ���� ��ȣ : 10845
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 			����� �� ���� �����̴�. 
 * 			push X	: ���� X�� ť�� �ִ� �����̴�. 
 * 			pop		: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
 * 			size	: ť�� ����ִ� ������ ������ ����Ѵ�.
 * 			empty	: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
 * 			front	: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
 * 			back	: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *
 * ��       �� : ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 * 			�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 *
 * ��       �� : ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_10845 {

	public static void main(String[] args) throws Exception{
		// ���̵�� : frontIndex, backIndex �� ��� �迭�� �ִ밪�� �ְ�, ���� ������ �ϳ��� �ٿ�������. 
		// �Է� �� ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int N = Integer.parseInt(st.nextToken()); 	// �־��� ����� ����. ��� push �� ������ ��� ť�� �ִ밪�̱⵵ �� 
		int[] queue = new int[N+1]; 				// ť �迭 ���� 
		int frontIndex = N; 						// ť�� ���� �ε��� (���� ����ִ� ���� ��ġ) 
		int backIndex = N; 							// ť�� ���� �ε��� (���� ����ִ� ���� ��ġ���� �ϳ� ���� �ε���) 
		
		String command; 							// �Է¹��� ��ɾ�
		int var;									// ��ɾ push �� �� ���� �� 
		
		for (int i = 1 ; i<=N ; i++) {
			st = new StringTokenizer(br.readLine()); 
			command = st.nextToken(); 
			// System.out.println(Arrays.toString(queue)); 
			
			switch (command) { 
				case "push": // push X: ���� X�� ť�� �ִ� �����̴�. 
					var = Integer.parseInt(st.nextToken()); 
					queue[backIndex] = var; backIndex--; 
					break; 
				case "pop": // pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
					if (frontIndex == backIndex) { 
						System.out.println(-1); // ť�� ������ ���� ��� -1 ��� 
					}else {
						System.out.println(queue[frontIndex]); 
						frontIndex--; 
						} 
					break; 
				case "size": // size: ť�� ����ִ� ������ ������ ����Ѵ�. 
					System.out.println(frontIndex - backIndex ); 
					break; 
				case "empty": // empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�. 
					if (frontIndex == backIndex) {
						System.out.println(1); 
					}else { 
						System.out.println(0); 
					}
					break; 
				case "front": 
					// front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
					if (frontIndex == backIndex) { 
						System.out.println(-1); // ť�� ������ ���� ��� -1 ��� 
					}else {
						System.out.println(queue[frontIndex]); 
					// frontIndex �� ���� ����ִ� ���� ��ġ�� ����Ŵ 
					} 
					break; 
				case "back": // back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
					if (frontIndex == backIndex) { 
						System.out.println(-1); // ť�� ������ ���� ��� -1 ��� 
					}else { 
						System.out.println(queue[backIndex+1]);
					// backIndex �� ���� ����ִ� ���� ��ġ���� �ϳ� ���� �ε����� ����Ŵ 
					} 
					break; 
				default: 
					break;
			}
		}
	}
}
