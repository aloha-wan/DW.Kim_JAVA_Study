package Mathematics;

import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 21.
 * 문제 제목 : 2진수8진수
 * 문제 번호 : 1373
 * 문제 출처 : https://www.acmicpc.net/problem/1373
 * 
 * 문       제 : 2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
 *
 * 출       력 : 첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
 *
 * 
 **/
public class Main_1373_2진수8진수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();	// 2진수 입력
		int s = n.length();			// 입력한 길이
		
		// 2진수에서 8진수 변환은 2진수에서 3개씩 끊어서 계산해야하는데 
		// 끊었을때 남는 수가 1이나 10 11인 경우가 있을 수 있으므로 고려해서 계산한다.
        if (s % 3 == 1) {
            System.out.print(n.charAt(0));
        } else if (s % 3 == 2) {
            System.out.print((n.charAt(0)-'0') * 2 + (n.charAt(1)-'0'));
        }
        
        for (int i = s % 3; i < s; i+=3) {
            System.out.print((n.charAt(i)-'0') * 4 + (n.charAt(i+1)-'0') * 2 + (n.charAt(i+2)-'0'));
        }
        
        System.out.println();
		
	}

}
