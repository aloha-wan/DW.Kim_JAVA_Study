package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : ���� ������ �Ǻ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12934
 * 
 * ��       �� : ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
 *          n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
 *
 * ���� ���� : n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
 *
 * ����� �� : n	return
 *         121	144
 *         3	-1
 *
 * 
 **/
public class �����������Ǻ� {
    public long solution(long n) {
        long answer = -1;
        
        double x = Math.sqrt(n);
        
        // ��Ʈ ���� ���� ������ ���
        if(x == (int)x){
        	answer = (long)Math.pow(x+1,2);
        }
        
        return answer;
    }
}
