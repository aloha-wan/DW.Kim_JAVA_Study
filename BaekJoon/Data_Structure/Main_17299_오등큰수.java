package Data_Structure;

import java.io.*;
import java.util.Stack;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 20.
 * 문제 제목 : 오등큰수
 * 문제 번호 : 17299
 * 문제 출처 : https://www.acmicpc.net/problem/17299
 * 
 * 문       제 : 크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오등큰수 NGF(i)를 구하려고 한다.
 *         Ai가 수열 A에서 등장한 횟수를 F(Ai)라고 했을 때, Ai의 오등큰수는 오른쪽에 있으면서 수열 A에서 등장한 횟수가 F(Ai)보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오등큰수는 -1이다.
 *         예를 들어, A = [1, 1, 2, 3, 4, 2, 1]인 경우 F(1) = 3, F(2) = 2, F(3) = 1, F(4) = 1이다. 
 *         A1의 오른쪽에 있으면서 등장한 횟수가 3보다 큰 수는 없기 때문에, NGF(1) = -1이다. 
 *         A3의 경우에는 A7이 오른쪽에 있으면서 F(A3=2) < F(A7=1) 이기 때문에, NGF(3) = 1이다. NGF(4) = 2, NGF(5) = 2, NGF(6) = 1 이다.
 *
 * 입       력 : 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
 *
 * 출       력 : 총 N개의 수 NGF(1), NGF(2), ..., NGF(N)을 공백으로 구분해 출력한다.
 *
 * 
 **/
public class Main_17299_오등큰수 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());	// 수열 크기
		int[] a = new int[n];						// 입력데이터 저장하는 배열
		int[] ans = new int[n];						// 결과를 저장하는 배열
		int[] freq = new int[1000001];				// 등장 횟수 저장하는 배열
		
		String[] temp = bf.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]);
			freq[a[i]] += 1;
		}
		
		Stack<Integer> st = new Stack<>();			// 인덱스 값을 저장할 스택 선언
		st.push(0);
		
		for(int i = 1; i < n; i++) {
			if(st.isEmpty()) {
				st.push(i);
			}
			// 오등큰수를 판단하는 조건 -      스택에 가장 높은 수 < 현재 수가 등장한 횟수
			while(!st.isEmpty() && freq[a[st.peek()]] < freq[a[i]]) {
				ans[st.pop()] = a[i];
			}
			st.push(i);
		}

		// 스택에 값이 없으면 -1 
		while(!st.empty()) {
			ans[st.pop()] = -1;
		}

		// 값을 출력한다.
		for(int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();

	}

}
