package Data_Structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 12.
 * 문제 제목 : 에디터
 * 문제 번호 : 1406
 * 문제 출처 : https://www.acmicpc.net/problem/1406
 * 
 * 문       제 : 한 줄로 된 간단한 에디터를 구현하려고 한다. 이 편집기는 영어 소문자만을 기록할 수 있는 편집기로, 최대 600,000글자까지 입력할 수 있다.
 *          이 편집기에는 '커서'라는 것이 있는데, 커서는 문장의 맨 앞(첫 번째 문자의 왼쪽), 문장의 맨 뒤(마지막 문자의 오른쪽), 또는 문장 중간 임의의 곳(모든 연속된 두 문자 사이)에 위치할 수 있다.
 *          즉 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다.
 *          
 *          이 편집기가 지원하는 명령어는 다음과 같다.
 *          L	= 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
 *          D	= 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
 *          B	= 커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
 *          	    삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
 *          P $	= $라는 문자를 커서 왼쪽에 추가함
 *          초기에 편집기에 입력되어 있는 문자열이 주어지고, 그 이후 입력한 명령어가 차례로 주어졌을 때, 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 구하는 프로그램을 작성하시오.
 *          단, 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치하고 있다고 한다.
 *
 * 입       력 : 첫째 줄에는 초기에 편집기에 입력되어 있는 문자열이 주어진다. 
 *          이 문자열은 길이가 N이고, 영어 소문자로만 이루어져 있으며, 길이는 100,000을 넘지 않는다. 
 *          둘째 줄에는 입력할 명령어의 개수를 나타내는 정수 M(1 ≤ M ≤ 500,000)이 주어진다. 
 *          셋째 줄부터 M개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다.
 *          명령어는 위의 네 가지 중 하나의 형태로만 주어진다.
 *
 * 출       력 : 첫째 줄에 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 출력한다.
 *
 * 
 **/
public class Main_1406_에디터 {

	public static void main(String[] args) throws IOException {
		
		//이것은 써보려고 노력하고 있지만 어색하고 어려움..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputAlpabet = br.readLine();
		
		//실제로 커서를 옮길 수 없으므로 왼쪽, 오른쪽 스택을 만들어 커서처럼 옮겨주기 위해 2개를 나눠서 스택 생성
		Stack<Character> leftStk = new Stack<Character>();		// Character 문자, String 문자열
		Stack<Character> rightStk = new Stack<Character>();
		
		//먼저 leftStk에 단어를 입력받는다.
		for(int i = 0; i < inputAlpabet.length(); i++) {
			leftStk.push(inputAlpabet.charAt(i));
		}
		
		// 명령할 명령어 갯수를 입력
		int testCase = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String testString = br.readLine();	// 명령어 입력
			char testChar = testString.charAt(0);
			
			//입력한 명령어 testChar에 따라 실행한다.
			switch(testChar) {
			case 'L':{
				// leftStk에 데이터가 있으면 가져와서 rightStk에 넣는다.
				if(!leftStk.isEmpty()) {
					rightStk.push(leftStk.pop());
				}
				break;
			}
			case 'D':{
				// rightStk에 데이터가 있으면 가져와서 leftStk에 넣는다.
				if(!rightStk.isEmpty()) {
					leftStk.push(rightStk.pop());
				}
				break;
			}
			case 'B':{
				// leftStk에 데이터가 있으면 하나를 뺀다.
				if(!leftStk.isEmpty()) {
					leftStk.pop();
				}
				break;
			}
			case 'P':{
				// 명령어 P는 입력할 문자를 가져오기 위해 testString를 가져온다.
				char addChar = testString.charAt(2);
				leftStk.push(addChar);
				break;
				}
			}
			
			// 출력을 순서대로 하기 위해 leftStk에 입력된 단어를 모두 rightStk으로 옮긴다.
			while(!leftStk.isEmpty()) {
				rightStk.push(leftStk.pop());
			}
			// rightStk을 출력한다.
			while(!rightStk.isEmpty()) {
				bw.write(rightStk.pop());
			}
			
			bw.flush();
			bw.close();
		}
		
	}

}
