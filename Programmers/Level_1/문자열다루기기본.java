package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 16.
 * 문제 제목 : 문자열다루기기본
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12918
 * 
 * 문       제 : 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
 *
 * 제한 조건 : s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 *
 * 입출력 예 : s		return
 *         "a234"	false
 *         "1234"	true
 *
 * 
 **/
public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] ch = s.toCharArray();
        
        if(s.length() == 4 || s.length() == 6 ) {
        	for(int i = 0; i < s.length(); i++) {
        		//아스키코드를 이용하여 문자를 체크한다.
        		if(ch[i] < 48|| ch[i] > 57) {
                	answer = false;
                	break;
        		}
        	}
        } else {
        	answer = false;
        }
        return answer;
    }
}
