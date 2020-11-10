package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 10.
 * 문제 제목 : 스택 수열
 * 문제 번호 : 1874
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 
 *          스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
 *          1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
 *          이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
 *          임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다.
 *          이를 계산하는 프로그램을 작성하라.
 *
 * 입       력 : 첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
 *
 * 출       력 : 입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
 *
 * 
 **/
public class Main_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		Stack<Integer> s = new Stack<>();			// 스택 
		ArrayList<String> al = new ArrayList<>();	// 연산 저장할 ArrayList
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int k = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());	// 수열 입력
		}

		for(int i = 1; i <= n; i++) {	// push, pop 진행
			s.push(i); 					// 수열의 해당 수가 아닐 경우 계속적 push
			al.add("+");

			while(!s.isEmpty() && s.peek() == arr[k]) { // 수열 값이 나왔을 경우 스택이 비어있지 않다면 pop
				s.pop();
				al.add("-");
				k++;
			}
		}
		
		if(n == k) { // 수열의 값이 온전히 나올 경우 print
			for(String s1 : al) {
				System.out.println(s1);
			}
		} else { // 수열을 만들지 못하는 경우
			System.out.println("NO");
		}
	}
}
