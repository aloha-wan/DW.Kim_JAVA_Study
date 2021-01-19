package Level_1;

import java.util.Arrays;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 20.
 * 문제 제목 : K번째수
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/42748
 * 
 * 문       제 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 *          예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 *           1.array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 *           2.1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 *           3.2에서 나온 배열의 3번째 숫자는 5입니다.
 *          배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 조건 : array의 길이는 1 이상 100 이하입니다.
 *         array의 각 원소는 1 이상 100 이하입니다.
 *         commands의 길이는 1 이상 50 이하입니다.
 *         commands의 각 원소는 길이가 3입니다.
 *
 * 입출력 예 : array					commands							return
 *         [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 *
 * 
 **/
public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLn = commands.length;
        int[] answer = new int[commandsLn];	//정렬해서 나온 수
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(int cont = 0; cont < commandsLn; cont++) {
        	i = commands[cont][0];			// array의 i번째
        	j = commands[cont][1];			// array의 j번째
        	k = commands[cont][2];			// array에서 추출하여 정렬한 수 중 k번째 수
        	
        	int[] temp = new int[j-i+1];	// 추출하여 저장할 배열 선언
        	
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
