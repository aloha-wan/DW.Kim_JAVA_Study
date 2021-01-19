package Level_1;

import java.util.Arrays;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 20.
 * 문제 제목 : 나누어 떨어지는 숫자 배열
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12910
 * 
 * 문       제 : array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 *         divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한 조건 : arr은 자연수를 담은 배열입니다.
 *         정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 *         divisor는 자연수입니다.
 *         array는 길이 1 이상인 배열입니다.
 *
 * 입출력 예 : arr				divisor		return
 *         [5, 9, 7, 10]	5			[5, 10]
 *         [2, 36, 1, 3]	1			[1, 2, 3, 36]
 *         [3,2,6]			10			[-1]
 *
 * 
 **/
public class 나누어떨어지는숫자배열 {
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
