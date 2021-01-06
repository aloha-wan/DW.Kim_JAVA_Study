package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 6.
 * 문제 제목 : 1로 만들기 
 * 문제 번호 : 1463
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *           1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 *           2. X가 2로 나누어 떨어지면, 2로 나눈다.
 *           3. 1을 뺀다.
 *          정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * 입       력 : 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 *
 * 출       력 : 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 *
 * 
 **/
public class Main_1463_2 {

	//Bottom-up 방식
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] d = new int[n+1];
        
        d[1] = 0;
        
        for (int i=2; i<=n; i++) {
            d[i] = d[i-1] + 1;
            
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }
        
        System.out.println(d[n]);
    }
}