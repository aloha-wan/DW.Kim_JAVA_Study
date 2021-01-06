package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 20.
 * 문제 제목 : 덱
 * 문제 번호 : 10866
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *          명령은 총 여덟 가지이다.
 *          	push_front X : 정수 X를 덱의 앞에 넣는다.
 *          	push_back X  : 정수 X를 덱의 뒤에 넣는다.
 *          	pop_front	 : 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *          	pop_back	 : 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *              size		 : 덱에 들어있는 정수의 개수를 출력한다.
 *              empty		 : 덱이 비어있으면 1을, 아니면 0을 출력한다.
 *              front		 : 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *              back		 : 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *          
 * 입       력 : 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
 *          둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출       력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
 * 
 **/
public class Main_10866_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 기본 변수 선언 및 인스턴스 생성
		String kind = "";								//문제에서 주어진 명령을 분류하기 위해 필요한 변수 선언
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deQ = new ArrayDeque<Integer>();	//문제의 DeQue 를 구현하기 위한 객체
		
		while(n-- != 0) {
			kind = br.readLine();
			if(kind.startsWith("push_front")) { 		// void addFirst(E e) : 덱의 가장 앞에 정수를 삽입한다.
				deQ.addFirst(Integer.parseInt(kind.split(" ")[1]));
			} else if(kind.startsWith("push_back")) { 	// void addLast(E e) : 덱의 가장 뒤에 정수를 삽입한다.
				deQ.addLast(Integer.parseInt(kind.split(" ")[1]));
			} else if(kind.startsWith("pop_front")) { 	// boolean isEmpty() : 덱이 비어있는지 체크한다, 비어있다면 true, 비어있지 않다면 false 반환한다.
														//E pollFirst() : 덱의 가장 앞에 있는 정수를 빼면서 그 정수를 반환한다.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.pollFirst() + "\n");
			} else if(kind.startsWith("pop_back")) { 	// E pollLast() : 덱의 가장 뒤에 있는 정수를 빼면서 그 정수를 반환한다.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.pollLast()+ "\n");
			} else if(kind.equals("size")) { 			// public int size() : 덱의 크기를 반환한다.
				sb.append(deQ.size() + "\n");
			} else if(kind.equals("empty")) {			// boolean isEmpty() : 덱이 비어있는지 체크한다, 비어있다면 true, 비어있지 않다면 false 반환한다.
				sb.append(deQ.isEmpty() ? "1\n" : "0\n");
			} else if(kind.equals("front")) { 			// E getFirst() : 덱의 가장 앞에 있는 정수를 반환한다.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.getFirst() + "\n");
			} else if(kind.equals("back")) { 			// E getLast() : 덱의 가장 뒤에 있는 정수를 반환한다.
				sb.append(deQ.isEmpty() ? "-1\n" : deQ.getLast() + "\n");
			} else {
				sb.append("error\n");
			}
		}
		System.out.println(sb.toString());
	}
}