package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 9.
 * 문제 제목 : 쉽게 푸는 문제
 * 문제 번호 : 1292
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.
 *          이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
 *          하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.
 *
 * 입       력 : 첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1≤A≤B≤1,000)가 주어진다. 즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.
 *
 * 출       력 : 첫 줄에 구간에 속하는 숫자의 합을 출력한다.
 *
 * 
 **/
public class Main_1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[500600];
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int idx = 0;
		int sum = 0;
		
		//바깥에서 1부터 1000까지 값을 불러옴
		out : for(int i = 1; i <= 1000; i++) {
			//i가 3이라면 0~2까지 총 3번 값이 들어가도록 반복해줌.
			for(int j = 0; j < i; j++) {
				idx++;
				arr[idx] = i;
				if(idx >= A && idx <= B) {
					sum += arr[idx];
				}
				if(idx == B) {
					break out;
				}
			}
		}
		System.out.println(sum);
		
	}

}
