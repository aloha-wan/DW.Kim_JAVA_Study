package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 20.
 * 문제 제목 : 소수 찾기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12921
 * 
 * 문       제 : 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요. 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)
 *
 * 제한 조건 : n은 2이상 1000000이하의 자연수입니다.
 *
 * 입출력 예 : n	return
 *         10	4
 *         5	3
 *
 * 
 **/
public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        int[] data = new int[n+1];
        
        for(int i = 2; i <= n; i++) {
        	for(int j = 2; i * j <= n; j++) {
        		data[i * j] = 1;
        	}
        }
        
        for(int i = 2; i <= n; i++) {
        	if(data[i] == 0) {
        		answer++;
        	}
        }
        return answer;
    }
}
