package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 8.
 * 문제 제목 : 문자열을 정수로 바꾸기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12925
 * 
 * 문       제 : 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 *
 * 제한 조건 : s의 길이는 1 이상 5이하입니다.
 *          s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 *          s는 부호와 숫자로만 이루어져있습니다.
 *          s는 0으로 시작하지 않습니다.
 *
 * 입출력 예 : 예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
 *          str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 *
 * 
 **/
public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;
        
        answer = Integer.valueOf(s);
        return answer;
	}

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
    	String str1 = "1234";
    	String str2 = "-1234";
    	
    	문자열을정수로바꾸기 str = new 문자열을정수로바꾸기();
        System.out.println(str.solution(str1));
        System.out.println(str.solution(str2));
    }
}
