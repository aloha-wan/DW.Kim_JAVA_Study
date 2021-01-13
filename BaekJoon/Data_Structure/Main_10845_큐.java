package Data_Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : ť
 * ���� ��ȣ : 10845
 * ���� ��ó : https://www.acmicpc.net/problem/10845
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
public class Main_10845_ť {

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

/*
public class Main_10845_1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] queue = new int[n];
        int begin = 0;
        int end = 0;
        
        while (n-- > 0) {
            String cmd = sc.next();
            
            if (cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                queue[end++ ] = num;
            } else if (cmd.equals("front")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                }
            } else if (cmd.equals("size")) {
                System.out.println(end-begin);
            } else if (cmd.equals("empty")) {
                if (begin == end) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                    begin += 1;
                }
            } else if (cmd.equals("back")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[end-1]);
                }
            }
        }
    }
}

*/