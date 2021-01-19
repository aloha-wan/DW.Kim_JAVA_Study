package Level_1;

import java.util.Arrays;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : ������ �������� ���� �迭
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12910
 * 
 * ��       �� : array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
 *         divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
 *
 * ���� ���� : arr�� �ڿ����� ���� �迭�Դϴ�.
 *         ���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
 *         divisor�� �ڿ����Դϴ�.
 *         array�� ���� 1 �̻��� �迭�Դϴ�.
 *
 * ����� �� : arr				divisor		return
 *         [5, 9, 7, 10]	5			[5, 10]
 *         [2, 36, 1, 3]	1			[1, 2, 3, 36]
 *         [3,2,6]			10			[-1]
 *
 * 
 **/
public class ����������¼��ڹ迭 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		count++;
        	}
        }
        
        int temp = 0;
        if(count > 0) {
        	answer = new int[count];
            for(int i = 0; i < arr.length; i++) {
            	if(arr[i] % divisor == 0) {
            		answer[temp] = arr[i];
            		temp++;
            	}
            }
            Arrays.sort(answer);
        } else {
        	answer = new int[1];
    		answer[0] = -1;
        }
        return answer;
    }
}
