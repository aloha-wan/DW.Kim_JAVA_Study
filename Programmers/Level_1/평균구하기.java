package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 평균 구하기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12944
 * 
 * 문       제 : 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * 제한 조건 : arr은 길이 1 이상, 100 이하인 배열입니다.
 *          arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 *
 * 입출력 예 : arr			return
 *         [1,2,3,4]	2.5
 *         [5,5]		5
 *
 * 
 **/
public class 평균구하기 {
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
