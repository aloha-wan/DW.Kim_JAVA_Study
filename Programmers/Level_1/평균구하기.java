package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : ��� ���ϱ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12944
 * 
 * ��       �� : ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
 *
 * ���� ���� : arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
 *          arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
 *
 * ����� �� : arr			return
 *         [1,2,3,4]	2.5
 *         [5,5]		5
 *
 * 
 **/
public class ��ձ��ϱ� {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        answer = sum / arr.length;
        
        return answer;
    }
}
