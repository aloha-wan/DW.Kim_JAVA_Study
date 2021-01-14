package Data_Structure;

import java.io.*;
import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 14.
 * 문제 제목 : 요세푸스 문제
 * 문제 번호 : 1158
 * 문제 출처 : https://www.acmicpc.net/problem/1158
 * 
 * 문       제 : 요세푸스 문제는 다음과 같다. 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
 *          이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
 *          이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
 *          예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다. 
 *          N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
 *
 * 출       력 : 예제와 같이 요세푸스 순열을 출력한다.
 *
 * 
 **/
public class Main_1158_요세푸스문제 {

	//StringBuilder는 String과 문자열을 더할때 새로운 객체를 생성하는 것이 아니라 기존의 데이터를 
	//                          더하는 방식을 사용하기 때문에 속도도 빠르며상대적으로 부하가 적다.
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		/* input reader */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 분석할 문자열을 입력 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 사람 인원 수
		int k = Integer.parseInt(st.nextToken());	// 제거할 k번째
		
		int cursor = k - 1;
		int size = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// 사람 인원 수 만큼 list에 숫자 넣기
		for(int ii = 0; ii < n; ii++) {
			list.add(ii + 1);
		}
		
		k = k - 1;
		n = n - 1;
		size = list.size();
		
		for(int ii = 0; ii < n; ii++) {
			if(cursor < size) {
				if(list.isEmpty() == false) {
					sb.append(list.get(cursor) + ", ");
					list.remove(cursor);
				}
			} else {
				cursor = cursor - size;
				while(cursor >= size) {
					cursor = cursor - size;
				}
				if(list.isEmpty() == false) {
					sb.append(list.get(cursor) + ", ");
					list.remove(cursor);
				}
			}
			
			cursor += k;
			size = list.size();
		}
		
		sb.append(list.get(0) + ">");
		
		System.out.println(sb);
		
		br.close();
	}

}
