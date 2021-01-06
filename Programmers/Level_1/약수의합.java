package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 약수의 합
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12928
 * 
 * 문       제 : 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건 : n은 0 이상 3000이하인 정수입니다.
 *
 * 입출력 예 : a	return
 *         12	28
 *         5	6
 *         
 * 입출력 예 #1 
 *   12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
 * 입출력 예 #2
 *   5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
 *
 * 
 **/
public class 약수의합 {
    public int solution(int n) {	
        int answer = 0;		// 약수 총 합
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		answer += (n / i);
        	}
        }
        return answer;
    }
}