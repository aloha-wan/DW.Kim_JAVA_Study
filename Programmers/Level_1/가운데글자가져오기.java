package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 가운데 글자 가져오기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * 문       제 : 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 제한 조건 : s는 길이가 1 이상, 100이하인 스트링입니다.
 *
 * 입출력 예 : a		return
 *         "abcde"	"c"
 *         "qwer"	"we"
 *
 * 
 **/
public class 가운데글자가져오기 {
    public String solution(String s) {
    	String answer = "";
    	
    	if(s.length() % 2 == 1) {
    		answer = s.substring(s.length()/2, s.length()/2+1);
    	} else {
    		answer = s.substring(s.length()/2-1, s.length()/2+1);
    		
    	}
        
        return answer;
	}

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
    	가운데글자가져오기 se = new 가운데글자가져오기();
        System.out.println(se.solution("abcde"));
        System.out.println(se.solution("qwer"));
    }
}



//모범 답안

class StringExercise{
    String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}