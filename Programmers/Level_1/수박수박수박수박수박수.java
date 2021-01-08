package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 8.
 * 문제 제목 : 수박수박수박수박수박수?
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12922
 * 
 * 문       제 : 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 *
 * 제한 조건 : n은 길이 10,000이하인 자연수입니다.
 *
 * 입출력 예 : n	return
 *         3	"수박수"
 *         4	"수박수박"
 *
 * 
 **/
public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";
        
    	if(n % 2 == 1) {
    		for(int i = 0; i < n/2; i++) {
    			answer += "수박";
    		}
			answer += "수";
    	}else {
    		for(int i = 0; i < n/2; i++) {
    			answer += "수박";
    		}
    	}
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
    	수박수박수박수박수박수 wm = new 수박수박수박수박수박수();
        System.out.println("n이 3인 경우 : " + wm.solution(3));
        System.out.println("n이 4인 경우 : " + wm.solution(4));
    }
}
