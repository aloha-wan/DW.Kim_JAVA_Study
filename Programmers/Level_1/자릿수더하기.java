package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 자릿수 더하기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12931
 * 
 * 문       제 : 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 *          예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 * 제한 조건 : N의 범위 : 100,000,000 이하의 자연수
 *
 * 입출력 예 : N	return
 *         123	6
 *         987	24
 * 입출력 예 #1
 *    문제의 예시와 같습니다.
 * 입출력 예 #2
 *    9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
 *
 * 
 **/
public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            if(n == 0){
            	continue;
            } else{
                answer += n % 10 ;
                n = n / 10;
            }
        }

        return answer;
    }
}
