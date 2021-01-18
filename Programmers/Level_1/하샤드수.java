package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 18.
 * 문제 제목 : 하샤드 수
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12947
 * 
 * 문       제 : 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 *         자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한 조건 : x는 1 이상, 10000 이하인 정수입니다.
 *
 * 입출력 예 : arr	return
 *         10	true
 *         12	true
 *         11	false
 *         13	false
 *
 * 
 **/
public class 하샤드수 {
	// 괜찮은 답안 스크랩
    public boolean solution1(int x) {
        boolean answer = true;
        int sum = 0;
    
    	String[] temp = String.valueOf(x).split("");
    
    	for(String s : temp) {
    		sum += Integer.parseInt(s);
    	} 
    	if(x % sum == 0) {
    		answer = true;
    	} else {
    		answer = false;
    	}
        return answer;
    }
    
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int yy = x;
        
        if(sum == 0) {
        	sum = 1;
        }
        
        long test = yy / sum;
        if(yy == test * sum) {
        	answer = true;
        } else {
        	answer = false;
        }
        return answer;
    }
}
