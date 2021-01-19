package Level_1;

import java.util.Arrays;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 20.
 * ���� ���� : K��°��
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/42748
 * 
 * ��       �� : �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
 *          ���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
 *           1.array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
 *           2.1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
 *           3.2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
 *          �迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 *
 * ���� ���� : array�� ���̴� 1 �̻� 100 �����Դϴ�.
 *         array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
 *         commands�� ���̴� 1 �̻� 50 �����Դϴ�.
 *         commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
 *
 * ����� �� : array					commands							return
 *         [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 *
 * 
 **/
public class K��°�� {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLn = commands.length;
        int[] answer = new int[commandsLn];	//�����ؼ� ���� ��
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(int cont = 0; cont < commandsLn; cont++) {
        	i = commands[cont][0];			// array�� i��°
        	j = commands[cont][1];			// array�� j��°
        	k = commands[cont][2];			// array���� �����Ͽ� ������ �� �� k��° ��
        	
        	int[] temp = new int[j-i+1];	// �����Ͽ� ������ �迭 ����
        	
        	int t = 0;
        	for(int z = i-1; z < j; z++) {
        		temp[t] = array[z];
        		t++;
        	}
        	
        	Arrays.sort(temp);
        	answer[cont] = temp[k-1];
        }
        
        return answer;
    }
}
