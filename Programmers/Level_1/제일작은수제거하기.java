package Level_1;

import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 20.
 * 문제 제목 : 제일 작은 수 제거하기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12935
 * 
 * 문       제 : 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 *          단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 *          예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * 제한 조건 : arr은 길이 1 이상인 배열입니다.
 *         인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 *
 * 입출력 예 : arr			return
 *         [4,3,2,1]	[4,3,2]
 *         [10]			[-1]
 *
 * 
 **/
public class 제일작은수제거하기 {
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
    // 내가 맞다고 생각하고 풀었는데 왜 안되는지 모르겠움..
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
    // 다른 풀이
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
