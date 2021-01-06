package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 짝수와 홀수
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12937
 * 
 * 문       제 : 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건 : num은 int 범위의 정수입니다.
 *         0은 짝수입니다.
 *
 * 입출력 예 : num	return
 *         3	"Odd"
 *         4	"Even"
 *
 * 
 **/
public class 짝수와홀수 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) {
        	answer = "Even";
        } else{
            answer = "Odd";
        }
        return answer;
    }
}
