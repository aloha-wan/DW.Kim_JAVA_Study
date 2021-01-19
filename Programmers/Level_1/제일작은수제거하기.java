package Level_1;

import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : ���� ���� �� �����ϱ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12935
 * 
 * ��       �� : ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 *          ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 *          ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 *
 * ���� ���� : arr�� ���� 1 �̻��� �迭�Դϴ�.
 *         �ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
 *
 * ����� �� : arr			return
 *         [4,3,2,1]	[4,3,2]
 *         [10]			[-1]
 *
 * 
 **/
public class ���������������ϱ� {
    public List<Integer> solution(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
        	if(min > arr[i]) {
        		min = arr[i];
        	}
        }
        List<Integer> answer = new ArrayList<>();
        	
        if(arr.length == 1) {
        	answer.add(-1);
        } else {
        	for(int i = 0; i < arr.length; i++) {
        		if(arr[i] == min) {
        			continue;
        		} else {
        			answer.add(arr[i]);
        		}
        	}
        }
        return answer;
    }
    // ���� �´ٰ� �����ϰ� Ǯ���µ� �� �ȵǴ��� �𸣰ڿ�..
    public int[] solution_1(int[] arr) {
        int[] answer = {};
        
        if(arr.length > 1) {
        	int minIndex = 0;
        	
        	for(int i = 1; i <= arr.length; i++) {
        		if(arr[0] == arr[i]) {
        			minIndex = i;
        		}
        	}
        	
        	answer = new int[arr.length-1];
        	int t = 0;
        	for(int i = 0; i < answer.length; i++) {
        		if(t == minIndex) {
        			continue;
        		} else {
        			answer[i] = arr[t];
        		}
        		t++;
        		
        	}
        	
        } else {
        	answer = new int[1];
        	answer[0] = -1;
        }
        	
        return answer;
    }
    // �ٸ� Ǯ��
    public int[] solution_2(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int minIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        for(int i = minIndex + 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
