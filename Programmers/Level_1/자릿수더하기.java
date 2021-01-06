package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : �ڸ��� ���ϱ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12931
 * 
 * ��       �� : �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
 *          ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 *
 * ���� ���� : N�� ���� : 100,000,000 ������ �ڿ���
 *
 * ����� �� : N	return
 *         123	6
 *         987	24
 * ����� �� #1
 *    ������ ���ÿ� �����ϴ�.
 * ����� �� #2
 *    9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
 *
 * 
 **/
public class �ڸ������ϱ� {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            if(n == 0){
            	continue;
            } else{
                answer += n % 10 ;
                n = n / 10;
            }
        }

        return answer;
    }
}
