package Level_1;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 8.
 * 문제 제목 : 직사각형 별찍기
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12969
 * 
 * 문       제 : 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다. 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 *
 * 제한 조건 : n과 m은 각각 1000 이하인 자연수입니다.
 *
 * 입출력 예 : n	m	return
 *         5 	3	*****
 *                 	*****
 *                  *****
 *
 * 
 **/
public class 직사각형별찍기 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
                System.out.print("*");
        	}
            System.out.println();
        }
	}

}
