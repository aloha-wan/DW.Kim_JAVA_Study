package Level_1;

import java.util.*;
/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : ���� ���ڴ� �Ⱦ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12906
 * 
 * ��       �� : �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
 *          ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
 *            arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
 *            arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
 *          �迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
 *
 * ���� ���� : �迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
 *          �迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
 *
 * ����� �� : arr				return
 *         [1,1,3,3,0,1,1]	[1,3,0,1]
 *         [4,4,4,3,3]		[4,3]
 *
 * 
 **/
public class �������ڴ½Ⱦ� {
    public int[] solution(int []arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        arr2.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] != arr[i-1]) {
        		arr2.add(arr[i]);
        	} else {
        		continue;
        	}
        }

        int[] answer = new int[arr2.size()];
        
        for(int i = 0; i < arr2.size(); i++) {
        	answer[i] = arr2.get(i);
        }
        
        return answer;
    }
}
