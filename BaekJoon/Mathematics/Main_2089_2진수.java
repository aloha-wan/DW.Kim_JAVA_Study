package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 25.
 * 문제 제목 : 2진수
 * 문제 번호 : 2089
 * 문제 출처 : https://www.acmicpc.net/problem/2089
 * 
 * 문       제 : -2진법은 부호 없는 2진수로 표현이 된다. 2진법에서는 20, 21, 22, 23이 표현 되지만 -2진법에서는 (-2)0 = 1, (-2)1 = -2, (-2)2 = 4, (-2)3 = -8을 표현한다. 
 *         10진수로 1부터 표현하자면 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001 등이다.
 *         10진법의 수를 입력 받아서 -2진수를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫 줄에 10진법으로 표현된 수 N이 주어진다.
 *
 * 출       력 : -2진법 수를 출력한다.
 *
 * 
 **/
public class Main_2089_2진수 {
    
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int input = sc.nextInt();
    	
    	if(input == 0) {
    		System.out.println(0);
    	} else {
    		while(input != 1) {
    			sb.append(Math.abs(input % -2));
    			input = (int)Math.ceil((double) input / (-2));
    		}
    		
    		sb.append(input);
    		
    		System.out.println(sb.reverse());
    	}
    }
}
