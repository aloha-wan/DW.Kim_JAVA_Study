package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 21.
 * 문제 제목 : 자연수 뒤집어 배열로 만들기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * 문       제 : 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건 : n은 10,000,000,000이하인 자연수입니다.
 *
 * 입출력 예 : n		return
 *         12345	[5,4,3,2,1]
 *
 * 
 **/
public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = {};

        // long 형태의 n이므로 StringBuilder를 활용하여 문자열로 변경
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        
        answer = new int[sb.toString().length()];
        
        int idx = 0;
        for(int i = sb.toString().length()-1; i >= 0; i--) {
        	answer[idx] = sb.toString().charAt(i) - '0';
        	idx++;
        }
        return answer;
    }
}
