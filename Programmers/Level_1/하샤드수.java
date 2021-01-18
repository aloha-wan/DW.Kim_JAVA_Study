package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 18.
 * ���� ���� : �ϻ��� ��
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12947
 * 
 * ��       �� : ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
 *         �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
 *
 * ���� ���� : x�� 1 �̻�, 10000 ������ �����Դϴ�.
 *
 * ����� �� : arr	return
 *         10	true
 *         12	true
 *         11	false
 *         13	false
 *
 * 
 **/
public class �ϻ���� {
	// ������ ��� ��ũ��
    public boolean solution1(int x) {
        boolean answer = true;
        int sum = 0;
    
    	String[] temp = String.valueOf(x).split("");
    
    	for(String s : temp) {
    		sum += Integer.parseInt(s);
    	} 
    	if(x % sum == 0) {
    		answer = true;
    	} else {
    		answer = false;
    	}
        return answer;
    }
    
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int yy = x;
        
        if(sum == 0) {
        	sum = 1;
        }
        
        long test = yy / sum;
        if(yy == test * sum) {
        	answer = true;
        } else {
        	answer = false;
        }
        return answer;
    }
}
