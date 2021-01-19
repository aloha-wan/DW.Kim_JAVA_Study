package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 20.
 * 문제 제목 : 정수 제곱근 판별
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12934
 * 
 * 문       제 : 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 *          n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * 제한 조건 : n은 1이상, 50000000000000 이하인 양의 정수입니다.
 *
 * 입출력 예 : n	return
 *         121	144
 *         3	-1
 *
 * 
 **/
public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = -1;
        
        double x = Math.sqrt(n);
        
        // 루트 값이 양의 정수일 경우
        if(x == (int)x){
        	answer = (long)Math.pow(x+1,2);
        }
        
        return answer;
    }
}
