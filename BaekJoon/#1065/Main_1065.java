package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 6.
 * 문제 제목 : 한수
 * 문제 번호 : 1065
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 *          N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 *
 * 입       력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출       력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 *
 * 
 **/
public class Main_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		if(n<0 || n>1000) {
			n = sc.nextInt();	// n이 0보다 작거나 1000보다 클 경우 다시 입력 하라는 코드
		}
		
		System.out.print(h(n));	// h 메소드를 호출해 한수인지 구별 후 갯수 출력하라는 코드
			
	}
	
   // h 메소드
	public static int h(int n) {
        // 변수 선언
		int i,u,t,h,temp,result = 0;
		
		if(n<100) {
			
			result = n;				// 100이하는 비교할게 없어서 모두 다 한수이므로, 그대로 출력하라는 코드 
			
		} else if(n<=1000) {		//100이상 1000이하 숫자들이 한수인지 구별하는 코드
			result = 99;			// 1~99까지는 다 한수니까 한수 갯수를 99부터 시작하게 함
			
			for(i=100; i<=n; i++) { 
				u = i % 10;			// 1의 자리 숫자 추출
			    t = (i % 100) / 10; // 10의 자리 숫자 추출
			    h = i / 100; 		//100의 자리 숫자 추출
			
			    if((t*2) == u+h) {
			    	result += 1; 	// 등차수열 공식 활용, 공식 성립하면 한수 이므로 result에 1 추가
			    }
	        }
			    
		}
		return result;
	}
	
}
