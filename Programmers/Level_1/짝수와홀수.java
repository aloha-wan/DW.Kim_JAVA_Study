package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : ¦���� Ȧ��
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12937
 * 
 * ��       �� : ���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
 *
 * ���� ���� : num�� int ������ �����Դϴ�.
 *         0�� ¦���Դϴ�.
 *
 * ����� �� : num	return
 *         3	"Odd"
 *         4	"Even"
 *
 * 
 **/
public class ¦����Ȧ�� {
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
