package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 8.
 * 문제 제목 : 최대공약수와 최소공배수
 * 문제 번호 : 2609
 * 문제 출처 : https://www.acmicpc.net/problem/2609
 * 
 * 문       제 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 *
 * 출       력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 *
 * 
 **/
public class Main_2609_최대공약수와최소공배수 {
	//유클리드 호제법을 이용하는 방법
	//a를 b로 나눈 나머지를 r이라고 했을때 GCD(a,b) = GCD(b,r)과 같다.
	//r이 0이면 그 때 b가 최대 공약수 이다.
	// 최소공배수(LCM)은 a * b / 최대공약수(GCD) 식으로 구할 수 있다.
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();	//입력 받을 자연수 1
        int b = sc.nextInt();	//입력 받을 자연수 2
        int g = gcd(a, b);		//최대공약수 구하기
        
        //LCM(최소공배수) = a * b / 최대공약수
        int l = a * b / g;		//최소공배수 구하기
        
        System.out.println(g);	//최대공약수
        System.out.println(l);	//최소공배수
    }
}
