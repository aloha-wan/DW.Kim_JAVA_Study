package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 8.
 * ���� ���� : �ִ������� �ּҰ����
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12940
 * 
 * ��       �� : �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
 *          ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
 *
 * ���� ���� : �� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
 *
 * ����� �� : n	m	return
 *         3	12	[3, 12]
 *         2	5	[1, 10]
 *
 * 
 **/
public class �ִ��������ּҰ���� {
	
	public int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};

        answer[0] = gcd(n,m);
        answer[1] = n * m / gcd(n,m);
        return answer;
    }

}
