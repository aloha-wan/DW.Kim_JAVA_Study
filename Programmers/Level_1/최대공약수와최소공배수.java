package Level_1;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 8.
 * 문제 제목 : 최대공약수와 최소공배수
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12940
 * 
 * 문       제 : 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
 *          예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 *
 * 제한 조건 : 두 수는 1이상 1000000이하의 자연수입니다.
 *
 * 입출력 예 : n	m	return
 *         3	12	[3, 12]
 *         2	5	[1, 10]
 *
 * 
 **/
public class 최대공약수와최소공배수 {
	
	public int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
    public int[] solution(int n, int m) {
        int[] answer = {0, 0};

        answer[0] = gcd(n,m);
        answer[1] = n * m / gcd(n,m);
        return answer;
    }

}
