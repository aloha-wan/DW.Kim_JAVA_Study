package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : ����� ��
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12928
 * 
 * ��       �� : ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 *
 * ���� ���� : n�� 0 �̻� 3000������ �����Դϴ�.
 *
 * ����� �� : a	return
 *         12	28
 *         5	6
 *         
 * ����� �� #1 
 *   12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.
 * ����� �� #2
 *   5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
 *
 * 
 **/
public class ������� {
    public int solution(int n) {	
        int answer = 0;		// ��� �� ��
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		answer += (n / i);
        	}
        }
        return answer;
    }
}