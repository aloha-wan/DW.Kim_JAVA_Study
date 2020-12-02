package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 2.
 * 문제 제목 : 2진수 8진수
 * 문제 번호 : 1373
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
 *
 * 출       력 : 첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
 *
 * 
 **/
public class Main_1373 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = s.length();
        
        if (n%3 == 1) {
            System.out.print(s.charAt(0));
        } else if (n%3 == 2) {
            System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
        }
        
        for (int i=n%3; i<n; i+=3) {
            System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
        }
        
        System.out.println();
    }
}