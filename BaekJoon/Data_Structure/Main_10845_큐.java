package Data_Structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 14.
 * 문제 제목 : 큐
 * 문제 번호 : 10845
 * 문제 출처 : https://www.acmicpc.net/problem/10845
 * 
 * 문       제 : 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오. 
 * 			명령은 총 여섯 가지이다. 
 * 			push X	: 정수 X를 큐에 넣는 연산이다. 
 * 			pop		: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
 * 			size	: 큐에 들어있는 정수의 개수를 출력한다.
 * 			empty	: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * 			front	: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
 * 			back	: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *
 * 입       력 : 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 * 			주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출       력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
 * 
 **/
public class Main_10845_큐 {

	public static void main(String[] args) throws Exception{
		// 아이디어 : frontIndex, backIndex 를 모두 배열의 최대값을 주고, 값이 들어오면 하나씩 줄여나간다. 
		// 입력 값 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int N = Integer.parseInt(st.nextToken()); 	// 주어진 명령의 개수. 모두 push 로 가정할 경우 큐의 최대값이기도 함 
		int[] queue = new int[N+1]; 				// 큐 배열 선언 
		int frontIndex = N; 						// 큐의 앞쪽 인덱스 (값이 들어있는 실제 위치) 
		int backIndex = N; 							// 큐의 뒷쪽 인덱스 (값이 들어있는 실제 위치보다 하나 작은 인덱스) 
		
		String command; 							// 입력받은 명령어
		int var;									// 명령어가 push 일 때 인자 값 
		
		for (int i = 1 ; i<=N ; i++) {
			st = new StringTokenizer(br.readLine()); 
			command = st.nextToken(); 
			// System.out.println(Arrays.toString(queue)); 
			
			switch (command) { 
				case "push": // push X: 정수 X를 큐에 넣는 연산이다. 
					var = Integer.parseInt(st.nextToken()); 
					queue[backIndex] = var; backIndex--; 
					break; 
				case "pop": // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
					if (frontIndex == backIndex) { 
						System.out.println(-1); // 큐에 정수가 없는 경우 -1 출력 
					}else {
						System.out.println(queue[frontIndex]); 
						frontIndex--; 
						} 
					break; 
				case "size": // size: 큐에 들어있는 정수의 개수를 출력한다. 
					System.out.println(frontIndex - backIndex ); 
					break; 
				case "empty": // empty: 큐가 비어있으면 1, 아니면 0을 출력한다. 
					if (frontIndex == backIndex) {
						System.out.println(1); 
					}else { 
						System.out.println(0); 
					}
					break; 
				case "front": 
					// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
					if (frontIndex == backIndex) { 
						System.out.println(-1); // 큐에 정수가 없는 경우 -1 출력 
					}else {
						System.out.println(queue[frontIndex]); 
					// frontIndex 는 값이 들어있는 실제 위치를 가리킴 
					} 
					break; 
				case "back": // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. 
					if (frontIndex == backIndex) { 
						System.out.println(-1); // 큐에 정수가 없는 경우 -1 출력 
					}else { 
						System.out.println(queue[backIndex+1]);
					// backIndex 는 값이 들어있는 실제 위치보다 하나 작은 인덱스를 가리킴 
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