package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : ���ڿ��ٷ��⺻
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12918
 * 
 * ��       �� : ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
 *
 * ���� ���� : s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
 *
 * ����� �� : s		return
 *         "a234"	false
 *         "1234"	true
 *
 * 
 **/
public class ���ڿ��ٷ��⺻ {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] ch = s.toCharArray();
        
        if(s.length() == 4 || s.length() == 6 ) {
        	for(int i = 0; i < s.length(); i++) {
        		//�ƽ�Ű�ڵ带 �̿��Ͽ� ���ڸ� üũ�Ѵ�.
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
