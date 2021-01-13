package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : ��� ���� ��������
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * ��       �� : �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 *
 * ���� ���� : s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
 *
 * ����� �� : a		return
 *         "abcde"	"c"
 *         "qwer"	"we"
 *
 * 
 **/
public class ������ڰ������� {
    public String solution(String s) {
    	String answer = "";
    	
    	if(s.length() % 2 == 1) {
    		answer = s.substring(s.length()/2, s.length()/2+1);
    	} else {
    		answer = s.substring(s.length()/2-1, s.length()/2+1);
    		
    	}
        
        return answer;
	}

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
    	������ڰ������� se = new ������ڰ�������();
        System.out.println(se.solution("abcde"));
        System.out.println(se.solution("qwer"));
    }
}



//��� ���

class StringExercise{
    String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}