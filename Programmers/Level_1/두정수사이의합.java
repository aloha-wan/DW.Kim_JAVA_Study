package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 5.
 * ���� ���� : �� ������ ������ ��
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12912
 * 
 * ��       �� : �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 *          ���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
 *
 * ���� ���� : a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
 *         a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
 *         a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
 *
 * ����� �� : a	b	return
 *         3	5	12
 *         3	3	3
 *         5	3	12
 *
 * 
 **/
public class �������������� {
	public long solution(int a, int b) {
		long answer = 0;
		
		if( a == b ) {
			answer = a;
		} else if( a < b ) {
			for( int i=a; i <= b; i++ ) {
				answer += i;
			}
		} else if( b < a ) {
			for( int i=b; i <= a; i++ ) {
				answer += i;
			}
		}
	
		return answer;

	}

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
    	�������������� sum = new ��������������();
        System.out.println("a�� 3, b�� 5�� ��� : " + sum.solution(3, 5));
        System.out.println("a�� 3, b�� 3�� ��� : " + sum.solution(3, 3));
        System.out.println("a�� 5, b�� 3�� ��� : " + sum.solution(5, 3));
    }
}

/* ��� ��� : ���������� �� ����
	class Solution {
	
	    public long solution(int a, int b) {
	        return sumAtoB(Math.min(a, b), Math.max(b, a));
	    }
	
	    private long sumAtoB(long a, long b) {
	        return (b - a + 1) * (a + b) / 2;
	    }
	}
*/
