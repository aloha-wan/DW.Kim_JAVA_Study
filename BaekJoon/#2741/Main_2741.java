package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 10. 31.
 * 문제 제목 : N찍기
 * 문제 번호 : 2741
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출       력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 *
 * 
 **/
public class Main_2741 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i = 1; i <= N; i++) {
	        System.out.println(i);
        }
    }
}