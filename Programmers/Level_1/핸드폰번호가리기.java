package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : �ڵ��� ��ȣ ������
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12948
 * 
 * ��       �� : ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
 *          ��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 *
 * ���� ���� : s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
 *
 * ����� �� : phone_number		return
 *         "01033334444"	"*******4444"
 *         "027778888"		"*****8888"
 *
 * 
 **/
public class �ڵ�����ȣ������ {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++) {
        	if(i < phone_number.length() - 4) {
        		answer += "*";
        	} else {
        		answer += phone_number.charAt(i);
        	}
        }
        
        return answer;
    }
}
