package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 18.
 * 문제 제목 : 최대공약수와 최소공배수
 * 문제 번호 : 2609
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 *
 * 출       력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 *
 * 
 **/
public class Main_2609 {

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a, b);
        int l = a * b / g;
        
        System.out.println(g);
        System.out.println(l);
    }
}
