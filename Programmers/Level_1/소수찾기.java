package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : �Ҽ� ã��
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12921
 * 
 * ��       �� : 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������. �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.(1�� �Ҽ��� �ƴմϴ�.)
 *
 * ���� ���� : n�� 2�̻� 1000000������ �ڿ����Դϴ�.
 *
 * ����� �� : n	return
 *         10	4
 *         5	3
 *
 * 
 **/
public class �Ҽ�ã�� {
    public int solution(int n) {
        int answer = 0;
        int[] data = new int[n+1];
        
        for(int i = 2; i <= n; i++) {
        	for(int j = 2; i * j <= n; j++) {
        		data[i * j] = 1;
        	}
        }
        
        for(int i = 2; i <= n; i++) {
        	if(data[i] == 0) {
        		answer++;
        	}
        }
        return answer;
    }
}
